package com.coffee.studio.util;

import com.coffee.studio.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JdkMap {

    public Map<Long, User> list2MapWithoutInitialCapacity(List<User> list) {
        Map<Long, User> map = new HashMap<>();
        for (User item : list) {
            map.put(item.getUserId(), item);
        }
        return map;
    }

    public Map<Long, User> list2MapWithInitialCapacity(List<User> list) {
        Map<Long, User> map = new HashMap<>(list.size());
        for (User item : list) {
            map.put(item.getUserId(), item);
        }
        return map;
    }

    public Map<Long, User> stream2Map(List<User> list) {
        return list.stream().collect(Collectors.toMap(User::getUserId, user -> user));
    }
}
