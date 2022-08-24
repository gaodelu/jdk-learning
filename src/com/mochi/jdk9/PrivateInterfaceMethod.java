package com.mochi.jdk9;

public interface PrivateInterfaceMethod {

    /**
     * jdk1.9新增
     */
    private static void testPri() {
        System.out.println("接口私有方法");
    }

    /**
     * jdk1.8新增静态方法和默认方法
     */
    public static void test1() {
        System.out.println("静态方法");
        testPri();
    }


    default void test2() { // 可以被实现类覆写
        System.out.println("默认方法");
        testPri();
    }


}
