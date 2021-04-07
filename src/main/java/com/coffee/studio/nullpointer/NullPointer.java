package com.coffee.studio.nullpointer;

import com.coffee.studio.model.User;

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

    public void equals() {
        User user = new User();
        if (user.getUserId() == 1) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }
}
