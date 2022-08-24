package com.mochi.jdk9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TransferTo {

    public static void main(String[] args) {
        //文件输出可以直接调用inputStream的transferTo()方法，将输入流中数据直接复制刷写到输出流中
        try (var inputStream = new FileInputStream("/xxx.txt");
             var outputStream = new FileOutputStream("test.txt");) {
            inputStream.transferTo(outputStream);
        } catch (Exception e) {
            System.err.println();
        }
    }
}
