package com.mochi.jdk16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeTest {

    public static void main(String[] args) {
        String a = DateTimeFormatter.ofPattern("a").format(LocalDateTime.now());
        System.out.println(a);
        String b = DateTimeFormatter.ofPattern("B").format(LocalDateTime.now());
        System.out.println(b);
        String k = DateTimeFormatter.ofPattern("K").format(LocalDateTime.now());
        System.out.println(k);
        String kk = DateTimeFormatter.ofPattern("kk").format(LocalDateTime.now());
        System.out.println(kk);
    }

}
