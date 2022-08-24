package com.mochi.jdk9;

import java.util.stream.Stream;

public class NewIterator {
    public static void main(String[] args) {
        Stream.iterate(0, x -> x < 3, x -> x + 1).forEach(System.out::println);
        System.out.println("--------------");
        //等价于
        for (int x=0;x<3;x++) {
            System.out.println(x);
        }
    }
}