package com.coffee.studio.util;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class JdkList {

    public void addList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(new Gson().toJson(list));
    }
}
