package com.mochi.jdk10;

public class VarTest {

    public static void main(String[] args) {
        var a = "123";
        var b = 123;
        var c = new VarTest();
       // Integer aInt = (Integer)a;
        var bInt = (Integer)b;
        System.out.println(a.getClass()); //String
        System.out.println(bInt.getClass());
        System.out.println(c.getClass());
    }
}
