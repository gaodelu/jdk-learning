package com.mochi.jdk11_lts;


public class StringChange {

    public static void main(String[] args) {
        String a = "　1  a  2 a 3 a 4    ";
        //删除首尾空格，不可以删除全角空格
        System.out.println(a.trim());
        //删除首尾空格，包括全角空格  since 11
        System.out.println(a.strip());
        //删除首空格，不包括全角空格  since 11
        System.out.println(a.stripLeading());
        //删除尾部空格，不包括全角空格  since 11
        System.out.println(a.stripTrailing());

        //lines()方法可以对字符串每一行进行流式处理
        "asc\nccc\nwww"
                .lines()
                .map(str -> str.replaceFirst(str.substring(1, 2), str.substring(1, 2).toUpperCase()))
                .forEach(System.out::println);

        //repeat方法,重复x次
        String repeat = "a".repeat(5);
        System.out.println(repeat);
    }
}
