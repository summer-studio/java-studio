package com.coffee.studio.nullpointer;

import org.junit.Test;

public class NullPointerTest {

    private final NullPointer nullPointer = new NullPointer();

    @Test
    public void valueCompareToNull() {
        boolean success = nullPointer.valueCompareToNull();
        System.out.println(success);
    }
}
