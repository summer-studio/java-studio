package com.coffee.studio.calculate;

import org.junit.Test;

public class JdkBigDecimalTest {

    private final JdkBigDecimal jdkBigDecimal = new JdkBigDecimal();

    @Test
    public void formatYuanToFen() {
        long value = jdkBigDecimal.formatYuanToFen();
        System.out.println(value);
    }
}
