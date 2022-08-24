package com.mochi.jdk12;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

    public static void main(String[] args) {
        var cnf = NumberFormat.getCompactNumberInstance(Locale.CHINA, NumberFormat.Style.SHORT);
        System.out.println(cnf.format(1L << 30));
        System.out.println(cnf.format(1000));
        System.out.println(cnf.format(1L << 40));
        System.out.println(cnf.format(1_9_2000));
        System.out.println(cnf.format(192000));
    }
}
