package com.coffee.studio.random;

import org.junit.Test;

public class JdkThreadLocalRandomTest {

    private final JdkThreadLocalRandom jdkThreadLocalRandom = new JdkThreadLocalRandom();

    @Test
    public void getRandom() {
        int value = jdkThreadLocalRandom.getRandom(1, 2);
        System.out.println(value);
    }
}
