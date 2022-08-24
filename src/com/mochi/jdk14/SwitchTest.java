package com.mochi.jdk14;

public class SwitchTest {
    public static void main(String[] args) {
        String s = "123";
        int result = switch (s) {
            case "123":
                yield 1;
            case "234":
                yield 2;
            default:
                System.out.println("error");
                yield 0;
        };
        System.out.println(result);

        s = "2344";
        int result1 = switch (s) {
            case "123" -> 123;
            case "234" -> 234;
            default -> {
                System.out.println("error");
                yield 0;
            }
        };
        System.out.println(result1);
    }
}
