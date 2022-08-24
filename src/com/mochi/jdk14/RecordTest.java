package com.mochi.jdk14;


public class RecordTest {
    public static void main(String[] args) {
        RecordEntity recordEntity = new RecordEntity(1,"测试");
        RecordEntity recordEntity1 = new RecordEntity(1,"测试");
        RecordEntity recordEntity2 = new RecordEntity(2,"测试");
        System.out.println(recordEntity.id());
        System.out.println(recordEntity.name());
        System.out.println(recordEntity.toString());
        System.out.println(recordEntity.equals(recordEntity1));
        System.out.println(recordEntity.equals(recordEntity2));
    }
}
