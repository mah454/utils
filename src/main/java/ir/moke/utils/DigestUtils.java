package ir.moke.utils;

import ir.moke.MokeException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.HexFormat;

public class DigestUtils {
    public static final SecureRandom secureRandom = new SecureRandom();

    public static byte[] generateSalt() {
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt);
        return salt;
    }

    public static String toHex(byte[] bytes) {
        return HexFormat.of().formatHex(bytes);
    }

    public static byte[] fromHex(String hex) {
        return HexFormat.of().parseHex(hex);
    }

    public static String toBase64(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static byte[] fromBase64(String data) {
        return Base64.getDecoder().decode(data.getBytes());
    }

    public static byte[] sha512(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            return md.digest(data.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new MokeException(e);
        }
    }

    public static byte[] sha512(String data, byte[] salt) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt);
            md.update(data.getBytes());
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new MokeException(e);
        }
    }

    public static byte[] sha256(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            return md.digest(data.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new MokeException(e);
        }
    }

    public static byte[] sha256(String data, byte[] salt) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt);
            md.update(data.getBytes());
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new MokeException(e);
        }
    }

    public static byte[] md5(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return md.digest(data.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new MokeException(e);
        }
    }

    public static byte[] md5(String data, byte[] salt) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(salt);
            md.update(data.getBytes());
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new MokeException(e);
        }
    }

    public static String sha512Hex(String data) {
        byte[] bytes = sha512(data);
        return toHex(bytes);
    }

    public static String sha512Hex(String data, byte[] salt) {
        byte[] bytes = sha512(data, salt);
        return toHex(bytes);
    }

    public static String sha512Base64(String data) {
        byte[] bytes = sha512(data);
        return toBase64(bytes);
    }

    public static String sha512Base64(String data, byte[] salt) {
        byte[] bytes = sha512(data, salt);
        return toBase64(bytes);
    }

    public static String sha256Hex(String data) {
        byte[] bytes = sha256(data);
        return toHex(bytes);
    }

    public static String sha256Hex(String data, byte[] salt) {
        byte[] bytes = sha256(data, salt);
        return toHex(bytes);
    }

    public static String sha256Base64(String data) {
        byte[] bytes = sha256(data);
        return toBase64(bytes);
    }

    public static String sha256Base64(String data, byte[] salt) {
        byte[] bytes = sha256(data, salt);
        return toBase64(bytes);
    }

    public static String md5Hex(String data) {
        byte[] bytes = md5(data);
        return toHex(bytes);
    }

    public static String md5Hex(String data, byte[] salt) {
        byte[] bytes = md5(data, salt);
        return toHex(bytes);
    }

    public static String md5Base64(String data) {
        byte[] bytes = md5(data);
        return toBase64(bytes);
    }

    public static String md5Base64(String data, byte[] salt) {
        byte[] bytes = md5(data, salt);
        return toBase64(bytes);
    }
}
