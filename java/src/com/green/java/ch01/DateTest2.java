package com.green.java.ch01;

import com.green.java.ch07.poly.Animal;

import java.sql.SQLOutput;

public class DateTest2 {
    public static void main(String[] args) {
        int y = 2023, m = 9, d = 2;

        String sMon = String.valueOf(m);
        if (m < 10) {
            sMon = "0" + sMon;
        }
        String sDay = String.valueOf(d);
        if (m < 10) {
            sDay = "0" + sDay;
        }

        System.out.printf("%s-%02s-%s\n", y, sMon);
    }
}

