package com.coffee.studio.calculate;

import org.junit.Test;

public class JdkDoubleTest {

    private final JdkDouble jdkDouble = new JdkDouble();

    @Test
    public void count() {
        double result = jdkDouble.count();
        System.out.println(result);
    }
}
