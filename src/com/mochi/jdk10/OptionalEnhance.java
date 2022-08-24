package com.mochi.jdk10;

import java.util.Optional;

public class OptionalEnhance {


    public static void main(String[] args) {
        System.out.println(Optional.ofNullable(null).orElse("123"));
        //也可以使用函数式接口实现
        System.out.println(Optional.ofNullable(null).orElseGet(() -> "123"));
        //或者抛出异常
        System.out.println(Optional.ofNullable(null).orElseThrow());
        System.out.println(Optional.ofNullable("123").orElseThrow());
    }
}
