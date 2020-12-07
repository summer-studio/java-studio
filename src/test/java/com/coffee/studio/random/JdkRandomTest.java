package com.coffee.studio.random;

import org.junit.Test;

public class JdkRandomTest {

    private final JdkRandom jdkRandom = new JdkRandom();

    @Test
    public void getRandom() {
        jdkRandom.getRandom();
    }
}
