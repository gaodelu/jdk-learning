package com.mochi.jdk13;

public class StringTest {

    public static void main(String[] args) {
        String sql = """
                     select a,b,c
                     from test
                     where 1=1;
                """;

        String html = """
                    <html>
                
                        <head></head>
                
                        <body>Hello World!</body>
                
                       </html>
                
                """;
        System.out.println("sql:".concat(sql));
        System.out.println("html:".concat(html));

        //unicode字符集扩展
        //Bidi，Normailzer，regex
    }
}
