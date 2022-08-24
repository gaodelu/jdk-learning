package com.mochi.jdk12;

public class SwitchTest {

    public static void main(String[] args) {
        var flag = "123";

        switch (flag) {
            case "123" -> System.out.println(1);
            case "234", "345" -> System.out.println(2);
            case "456" -> System.out.println(3);
            default -> System.out.println("No such fruit");
        }

        var flag1 = "123";

        int res = switch (flag1) {
            case "123" -> 1;
            case "234", "345" -> 2;
            case "456" -> 3;
            default -> 4;
        };
        System.out.println(res);
    }


}
