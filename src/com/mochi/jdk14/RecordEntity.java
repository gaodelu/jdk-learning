package com.mochi.jdk14;

/**
 * 对于头部中的每个组件，两个成员：一个public与组件同名和返回类型的访问器方法，以及一个private final与组件类型相同的字段；
 * 和标题相同方法签名的规范构造，在new方法调用时将赋予相应的值以初始化对象。
 * equals以及hashCode确保两个record值相同的方法，如果它们是相同的类型并且包含相同的组件值。
 * toString返回所有record组件的字符串表示形式及其名称的方法。
 * 继承java.lang.Record
 */
public record RecordEntity(int id,String name) {

}
