package com.coffee.studio.nullpointer;

public class NullPointer {

    /**
     * 具体值无法和 Null 类型进行比较大小，会导致空指针
     *
     * @return
     */
    public boolean valueCompareToNull() {
        Integer value = 3;
        Integer target = null;
        boolean success = value > target;
        return success;
    }
}
