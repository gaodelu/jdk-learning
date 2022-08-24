package com.mochi.jdk9;

import java.util.*;


public class QuickUnmodifyable {
    public static void main(String[] args) {
        List<Integer> integers = Collections.unmodifiableList(Arrays.asList(1, 2, 3));
        // java.lang.UnsupportedOperationException
        // integers.add(4);

        //9以后可使用这种方式
        List<Integer> integers1 = List.of(1, 2, 3);
        // java.lang.UnsupportedOperationException
        //integers1.add(4);


        Map<Object, Object> map = Collections.unmodifiableMap(new HashMap<>() {
            {
                put("a", "a");
                put("b", "b");
                put("c", "c");
            }
        });

        //9以后可使用这种方式
        Map<String, Object> map1 = Map.ofEntries(Map.entry("a", 1), Map.entry("b", 2), Map.entry("c", 3)); // 传入一个个键值对entry对象
        Map<String, Object> map2 = Map.of("a", 1, "b", 2, "c", 3); // 入参顺序：k1, v1, k2, v2...



    }
}
