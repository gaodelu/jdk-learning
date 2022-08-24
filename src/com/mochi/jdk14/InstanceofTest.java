package com.mochi.jdk14;

public class InstanceofTest {

    private String str;

    public static void main(String[] args) {
        Object obj = "jkdwhfio";
        if (obj instanceof String str) {
            System.out.println(str.length());
            //在此处可以使用str
        } else {
            //不可使用str
            System.out.println(" not a String!");
        }
    }
}
