package com.coffee.studio.util;

import com.coffee.studio.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JdkMapTest {

    private final JdkMap jdkMap = new JdkMap();

    private static final int LOOP_COUNT = 20;

    private static final int LIST_SIZE = 1000000;

    @Test
    public void list2MapWithoutInitialCapacity() {
        List<User> list = getUserList(LIST_SIZE);
        long total = 0L;

        for (int i = 0; i < LOOP_COUNT; i++) {
            long start = System.currentTimeMillis();

            jdkMap.list2MapWithoutInitialCapacity(list);

            long end = System.currentTimeMillis();

            long time = end - start;
            total += time;
            System.out.println(time);
        }

        System.out.println("avg:" + total / LOOP_COUNT);
    }

    @Test
    public void list2MapWithInitialCapacity() {
        List<User> list = getUserList(LIST_SIZE);
        long total = 0L;

        for (int i = 0; i < LOOP_COUNT; i++) {
            long start = System.currentTimeMillis();

            jdkMap.list2MapWithInitialCapacity(list);

            long end = System.currentTimeMillis();

            long time = end - start;
            total += time;
            System.out.println(time);
        }

        System.out.println("avg:" + total / LOOP_COUNT);
    }

    @Test
    public void stream2Map() {
        List<User> list = getUserList(LIST_SIZE);
        long total = 0L;

        for (int i = 0; i < LOOP_COUNT; i++) {
            long start = System.currentTimeMillis();

            jdkMap.stream2Map(list);

            long end = System.currentTimeMillis();

            long time = end - start;
            total += time;
            System.out.println(time);
        }

        System.out.println("avg:" + total / LOOP_COUNT);
    }

    private List<User> getUserList(int size) {
        List<User> list = new ArrayList<>(size);
        for (long i = 1; i <= size; i++) {
            User user = new User();
            user.setUserId(i);
            user.setUsername(String.valueOf(i));
            user.setAddress(String.valueOf(i));

            list.add(user);
        }
        return list;
    }
}
