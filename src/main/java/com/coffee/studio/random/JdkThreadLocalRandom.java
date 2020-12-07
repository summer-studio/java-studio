package com.coffee.studio.random;

import java.util.concurrent.ThreadLocalRandom;

public class JdkThreadLocalRandom {

    public int getRandom(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
