package ir.moke.test;

import ir.moke.utils.StringUtils;

public class StringUtilsTest {

    static void main() {
        System.out.println(StringUtils.isValidPassword("1234+_-="));
        System.out.println(StringUtils.isValidPassword("+_-="));
        System.out.println(StringUtils.isValidPassword("abc@#$ABC123&*(.[123]{wer?.,}"));
    }
}
