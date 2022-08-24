package com.mochi.jdk9;

import java.util.HashSet;
import java.util.Set;

public class DiamondTest {

    public static void main(String[] args) {
        /**
         * 创建范型类的时候，可以重写其中的方法
         */
        Set<String> set = new HashSet<String>() {
            @Override
            public boolean add(String s) {
                return super.add(s + "..");
            }
        };
        set.add("1");
        set.add("2");
        set.add("3");
        set.forEach(System.out::println);
    }
}
