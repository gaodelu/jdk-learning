package com.mochi.jdk11_lts;


import java.util.ArrayList;

public class EpsilonCollection {


    //-Xms10m -Xmx10m -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC
    public static void main(String[] args) {
        var list = new ArrayList<>();
        boolean flag = true;
        int count = 0;
        while (flag) {
            list.add(new Garbage());
            if (count % 100 == 0){
                System.out.println("---------");
            }
            if (count++ ==500) {
                System.out.println("do clear...");
                list.clear();
            }
        }

    }
}

class Garbage {
    private String bbb = "a".repeat(1024*1024);

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + " collecting");
    }
}