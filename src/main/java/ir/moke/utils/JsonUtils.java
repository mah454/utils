package ir.moke.utils;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JsonUtils {

    private static final ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();

        objectMapper.configure(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION, true);
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        objectMapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);

        objectMapper.registerModule(new ParameterNamesModule(JsonCreator.Mode.PROPERTIES));
        objectMapper.registerModule(new JavaTimeModule());

        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.enable(SerializationFeature.WRITE_DATES_WITH_ZONE_ID);

        objectMapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);
    }

    public static String toJson(Object o) throws JsonProcessingException {
        return objectMapper.writeValueAsString(o);
    }

    public static <T> T toObject(String str, Class<T> clazz) throws JsonProcessingException {
        return objectMapper.readValue(str, clazz);
    }

    public static <T> T toObject(byte[] bytes, Class<T> clazz) throws JsonProcessingException {
        return toObject(new String(bytes), clazz);
    }

    public static <T> T toObject(File file, Class<T> clazz) throws IOException {
        return objectMapper.readValue(file, clazz);
    }

    public static <T> List<Object> toList(String str) throws JsonProcessingException {
        TypeReference<List<Object>> typeRef = new TypeReference<>() {
        };
        return objectMapper.readValue(str, typeRef);

    }

    public static <T> List<T> toList(String str, Class<T> elementType) throws JsonProcessingException {
        CollectionType type = objectMapper.getTypeFactory().constructCollectionType(List.class, elementType);
        return objectMapper.readValue(str, type);
    }

    public static <T> Set<T> toSet(String str, Class<T> elementType) throws JsonProcessingException {
        CollectionType type = objectMapper.getTypeFactory().constructCollectionType(Set.class, elementType);
        return objectMapper.readValue(str, type);
    }

    public static <T> T toObject(String str, String canonicalType) throws JsonProcessingException {
        JavaType javaType = objectMapper.getTypeFactory().constructFromCanonical(canonicalType);
        return objectMapper.readValue(str, javaType);
    }

    public static <T> HashMap<String, T> toMap(String str, Class<? extends Map<String, T>> mapClassType, Class<T> genericType) throws JsonProcessingException {
        MapType mapType = objectMapper.getTypeFactory().constructMapType(mapClassType, String.class, genericType);
        return objectMapper.readValue(str, mapType);
    }

    public static <T> Map<String, T> toMap(String str) throws JsonProcessingException {
        TypeReference<HashMap<String, T>> typeRef = new TypeReference<>() {
        };
        return objectMapper.readValue(str, typeRef);
    }

    public static void writeToFile(File file, Object object) throws IOException {
        objectMapper.writeValue(file, object);
    }

    public static boolean isJson(String str) {
        try {
            readTree(str);
            return true;
        } catch (JsonProcessingException e) {
            return false;
        }
    }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public static <T> T convert(Object o, Class<T> clazz) {
        return objectMapper.convertValue(o, clazz);
    }

    public static JsonNode readTree(String str) throws JsonProcessingException {
        return objectMapper.readTree(str);
    }

    public static <T> T treeToValue(TreeNode treeNode, Class<T> clazz) throws JsonProcessingException {
        return objectMapper.treeToValue(treeNode, clazz);
    }

    public static boolean isNullOrEmpty(JsonNode node) {
        return node.isNull() && node.isEmpty();
    }
}
