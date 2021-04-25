package com.coffee.studio;

import org.junit.Test;

public class JavaTest {

    @Test
    public void test() {
        String s = cutOut("124", 4);
        System.out.println(s);

        s = cutOut("12345888", 4);
        System.out.println(s);
    }

    private static String cutOut(String input, int length) {
        if (input.length() <= length) {
            return input;
        }

        String city = input.substring(0, length);
        return city.concat("...");
    }
}
