package com.mochi.jdk15;

public class HiddenClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Class classLoader = ClassLoader.getSystemClassLoader().loadClass("xxx");

       // Class hidden  = MethodHandles.Lookup::defineHiddenClass;


    }
}
