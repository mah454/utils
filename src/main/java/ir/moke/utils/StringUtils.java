package ir.moke.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class StringUtils {
    private static final Pattern numeric_pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    private static final int SECURITY_RANDOM_LENGTH = 32;
    private static final String NUMBERS = "0123456789";
    private static final String ALPHABETIC = "abcdefghijklmnopqrstuvwxyz";
    private static final String ALPHABETIC_CAPITAL = ALPHABETIC.toUpperCase();
    private static final String ALL_CHARACTERS = ALPHABETIC + ALPHABETIC_CAPITAL + NUMBERS;
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static String formatSize(long v) {
        if (v < 1024) return v + " B";
        int z = (63 - Long.numberOfLeadingZeros(v)) / 10;
        return String.format("%.1f %sB", (double) v / (1L << (z * 10)), " KMGTPE".charAt(z));
    }

    public static String hashPassword(String password) {
        return Base64.encodeBase64String(DigestUtils.sha512(password));
    }

    public static String randomHash() {
        byte[] bytes = new byte[SECURITY_RANDOM_LENGTH];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(bytes);
        return Base64.encodeBase64String(bytes);
    }

    public static boolean isNumeric(String num) {
        if (num == null) {
            return false;
        }
        return numeric_pattern.matcher(num).matches();
    }

    public static int generateRandomNumber() {
        Random r = new Random();
        int low = 1000;
        int high = 9999;
        return r.nextInt(high - low) + low;
    }

    public static int generateRandomNumber(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low) + low;
    }

    public static String randomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = SECURE_RANDOM.nextInt(ALL_CHARACTERS.length());
            char randomChar = ALL_CHARACTERS.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public static String randomCaptcha(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = SECURE_RANDOM.nextInt(ALPHABETIC_CAPITAL.length());
            char randomChar = ALPHABETIC_CAPITAL.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public static byte[] generateRandomBytes(int length) {
        byte[] iv = new byte[length];
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);
        return iv;
    }

    public static String getWord() {
        try {
            Path wordsPath = Path.of("/etc/words");
            List<String> lines = Files.readAllLines(wordsPath);
            int count = lines.size();
            return lines.get(generateRandomNumber(1, count));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String truncateString(String input, int firstChars, int lastChars) {
        if (input == null || input.length() <= firstChars + lastChars) {
            return input;
        }
        String firstPart = input.substring(0, firstChars);
        String lastPart = input.substring(input.length() - lastChars);

        return firstPart + "..." + lastPart;
    }
}
