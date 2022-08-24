package com.mochi.jdk12;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesTest {

    public static void main(String[] args) {
        //返回两个Path对应的文件内容中首次字节不匹配发生的行索引，从0开始。如果返回-1，就是指两个文件内容完全一样
        try (FileWriter fileWriter1 = new FileWriter("test1.txt");
             FileWriter fileWriter2 = new FileWriter("test2.txt")) {
            fileWriter1.write("a");
            fileWriter1.write("b");
            fileWriter1.write("c");
            fileWriter1.close();
            fileWriter2.write("a");
            fileWriter2.write("b");
            fileWriter2.write("E");
            fileWriter2.close();
            System.out.println(Files.mismatch(Path.of("test1.txt"), Path.of("test2.txt")));
        } catch (IOException e) {
            System.err.println("异常：" + e);
        }
    }
}
