package com.mochi.jdk9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EnhanceStream {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(9);
        // 直到不满足条件，停止读取
        a.stream().takeWhile(b -> b < 5).forEach(System.out::println);
        System.out.println("----------");
        //直到满足条件，才开始读取
        a.stream().dropWhile(b -> b < 5).forEach(System.out::println);
        System.out.println("----------");

        Stream.ofNullable(null).forEach(System.out::println);
        System.out.println("----------");

        Stream.of("123", "234", null, null, "345").forEach(System.out::println);
    }
}
