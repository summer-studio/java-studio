package com.coffee.studio.calculate;

import java.math.BigDecimal;

public class JdkBigDecimal {

    public long formatYuanToFen() {
        double d = 17.4 * 100;
        System.out.println(d);
        BigDecimal value = new BigDecimal(d);
        return value.setScale(0, BigDecimal.ROUND_DOWN).longValue();
    }
}
