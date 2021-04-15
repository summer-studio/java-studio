package com.coffee.studio.immutable;

import com.coffee.studio.model.User;

public class FinalModel {

    public User setUser(final User user) {
        user.setUserId(1L);
        user.setUsername("xxx");
        return user;
    }
}
