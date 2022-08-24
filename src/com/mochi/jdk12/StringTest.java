package com.mochi.jdk12;

public class StringTest {

    public static void main(String[] args) {
        //对字符串进行链式转换
        Integer a=null;
        String transform = "abc".transform(x->x+"def").transform(String::toUpperCase);
        System.out.println(transform);
        //在字符串的每一行前面加空格
        System.out.println("aaa" + transform.indent(10));
        String indent = "12345\n67890";
        System.out.println(indent.indent(5));
    }
}
