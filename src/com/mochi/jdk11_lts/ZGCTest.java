package com.mochi.jdk11_lts;

public class ZGCTest {

    /**
     * -XX:+UnlockExperimentalVMOptions -XX:+UseZGC -Xmx10g
     * 其中参数： -Xmx 是 ZGC 收集器中最重要的调优选项，大大解决了程序员在 JVM 参数调优上的困扰。
     * ZGC 是一个并发收集器，必须要设置一个最大堆的大小，应用需要多大的堆，主要有下面几个考量：
     * 对象的分配速率，要保证在 GC 的时候，堆中有足够的内存分配新对象。
     * 一般来说，给 ZGC 的内存越多越好，但是也不能浪费内存，所以要找到一个平衡。
     */
    public static void main(String[] args) {

    }
}
