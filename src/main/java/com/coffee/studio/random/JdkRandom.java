package com.coffee.studio.random;

import java.util.Random;

public class JdkRandom {

    private static final Random RANDOM1 = new Random(10000);
    private static final Random RANDOM2 = new Random(10000);

    public void getRandom() {
        int maxValue = 5;
        for (int i = 0; i < maxValue; i++) {
            System.out.println(RANDOM1.nextInt() + " , " + RANDOM2.nextInt());
        }
    }
}
