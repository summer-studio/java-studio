package com.coffee.studio.stream;

import com.coffee.studio.model.User;

import java.util.List;

public class JdkListStream {

    public List<User> remove(List<User> list, long deleteUserId) {
        list.removeIf(x -> x.getUserId().equals(deleteUserId));
        return list;
    }
}
