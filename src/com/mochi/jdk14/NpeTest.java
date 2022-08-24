package com.mochi.jdk14;

public class NpeTest {

    public static void main(String[] args) {
        String a = "abc";
        String b = "cde";
        String c = null;
        System.out.println(a.length() + b.length() + c.length());

        /*
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "c" is null
        	at com.mochi.jdk14.NpeTest.main(NpeTest.java:9)
         */
    }
}
