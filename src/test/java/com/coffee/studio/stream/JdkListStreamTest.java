package com.coffee.studio.stream;

import com.coffee.studio.model.User;
import com.google.gson.Gson;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JdkListStreamTest {

    private final JdkListStream jdkListStream = new JdkListStream();

    @Test
    public void remove() {
        User user1 = new User();
        user1.setUserId(1L);

        User user2 = new User();
        user2.setUserId(2L);

        User user3 = new User();
        user3.setUserId(1L);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        List<User> result = jdkListStream.remove(list, 3);
        System.out.println(new Gson().toJson(result));
    }
}
