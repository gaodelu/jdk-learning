package com.mochi.jdk9;

import java.io.IOException;
import java.io.InputStreamReader;

public class NewTryCatch {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);
        InputStreamReader reader1 = new InputStreamReader(System.in);
        /**
         * 支持在try外进行实例化，try内对象为final不可再修改； 结束后自动释放
          */
        try (reader;reader1) { //支持多个，用;分隔即可
              // do something
            reader.read();
            reader1.read();
        } catch (IOException e) {
            System.err.println("异常：" + e);
        }
    }
}
