package com.coffee.studio.random;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class JdkSecureRandom {

    public int getRandom() {
        try {
            Random random = SecureRandom.getInstanceStrong();
            return random.nextInt();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
}
