package com.mochi.jdk11_lts;

public class HelloWorldTest {

    //以往版本需要先编译成class文件，再执行
    //此功能允许使用 Java 解释器直接执行 Java 源代码。源代码在内存中编译，然后由解释器执行。唯一的约束在于所有相关的类必须定义在同一个 Java 文件中。
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
