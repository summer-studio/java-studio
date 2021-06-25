package com.coffee.studio.lang;

import org.junit.Test;

public class JdkStringTest {

    private final JdkString jdkString = new JdkString();

    private final String target = "123abd1";

    @Test
    public void replace() {
        String result = jdkString.replace(target, "1", "z");
        System.out.println(result);
    }

    @Test
    public void replaceAll() {
        String result = jdkString.replaceAll(target, "1", "z");
        System.out.println(result);
    }
}
