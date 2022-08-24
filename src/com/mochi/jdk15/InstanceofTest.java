package com.mochi.jdk15;

public class InstanceofTest {

    private String str;

    @Override
    public boolean equals(Object o) {
        return o instanceof InstanceofTest t && t.str.equals(str); // 更简洁的equals()，避免显式强转
    }

    public void testString(Object o) {
        if (o instanceof String str) {
            System.out.println(str); // 临时变量str
        } else {
            System.out.println(str); // 实例字段str
        }

    }
}
