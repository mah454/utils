package ir.moke.test;

import ir.moke.utils.DigestUtils;

public class DigestUtilsTest {
    static void main() {

        String name = "Mahdi";
        System.out.println(DigestUtils.md5Hex(name));
        System.out.println(DigestUtils.sha512Hex(name));
        System.out.println(DigestUtils.sha256Hex(name));
    }
}
