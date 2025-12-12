package ir.moke.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import ir.moke.MokeException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class YamlUtils {

    private static final ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper(new YAMLFactory());
        objectMapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_EMPTY);
        objectMapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String toYaml(Object o) {
        try {
            return objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new MokeException(e);
        }
    }

    public static <T> T toObject(String str, Class<T> clazz) {
        try {
            return objectMapper.readValue(str, clazz);
        } catch (JsonProcessingException e) {
            throw new MokeException(e);
        }
    }

    public static <T> T toObject(byte[] bytes, Class<T> clazz) {
        return toObject(new String(bytes), clazz);
    }

    public static <T> T toObject(File file, Class<T> clazz) {
        try {
            return objectMapper.readValue(file, clazz);
        } catch (IOException e) {
            throw new MokeException(e);
        }
    }

    public static <T> T toObject(Path path, Class<T> clazz) {
        try {
            return objectMapper.readValue(path.toFile(), clazz);
        } catch (IOException e) {
            throw new MokeException(e);
        }
    }

    public static void writeToFile(File file, Object object) {
        try {
            objectMapper.writeValue(file, object);
        } catch (IOException e) {
            throw new MokeException(e);
        }
    }

    public static Properties loadAsProperties(File file) {
        Properties props = new Properties();
        try {
            Map<String, Object> yamlMap = objectMapper.readValue(file, new TypeReference<>() {
            });
            flattenMap("", yamlMap, props);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return props;
    }

    public static Properties loadAsProperties(InputStream is) {
        Properties props = new Properties();
        try {
            Map<String, Object> yamlMap = objectMapper.readValue(is, new TypeReference<>() {
            });
            flattenMap("", yamlMap, props);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return props;
    }

    @SuppressWarnings("unchecked")
    private static void flattenMap(String prefix, Map<String, Object> map, Properties props) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = normalizeKey(prefix.isEmpty() ? entry.getKey() : prefix + "." + entry.getKey());
            Object value = entry.getValue();

            if (value instanceof Map) {
                flattenMap(key, (Map<String, Object>) value, props);
            } else if (value instanceof List<?> list) {
                for (int i = 0; i < list.size(); i++) {
                    Object item = list.get(i);
                    if (item instanceof Map) {
                        flattenMap(key + "[" + i + "]", (Map<String, Object>) item, props);
                    } else {
                        props.put(key + "[" + i + "]", item);
                    }
                }
            } else {
                props.put(key, value == null ? "" : String.valueOf(value));
            }
        }
    }

    private static String normalizeKey(String key) {
        // make dash/underscore/dot interchangeable → all to dot
        return key.replace("-", ".").replace("_", ".");
    }
}
