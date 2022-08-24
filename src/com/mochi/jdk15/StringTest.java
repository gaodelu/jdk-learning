package com.mochi.jdk15;

public class StringTest {

    /**
     * \ 取消换行
     * \s 空格
     * @param args
     */
    public static void main(String[] args) {
        String sql = """
                select a,b,c from test;
                """;
        System.out.println(sql);

        String sql1= """
                select a,b,c from \
                test;
                """;
        System.out.println(sql1);

        String sql2 = """
                select a,b,c\sfrom test;
                """;
        System.out.println(sql2);
    }
}
