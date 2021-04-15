package com.coffee.studio.immutable;

import com.coffee.studio.model.User;
import org.junit.Test;

public class FinalModelTest {

    private final FinalModel finalModel = new FinalModel();

    @Test
    public void setUser() {
        User user = new User();
        user.setUserId(2L);
        user.setUsername("jack");

        User newUser = finalModel.setUser(user);
        System.out.println(newUser.toString());
    }
}