package com.green.java.ch01;

public class DateTest2_2 {
    public static void main(String[] args) {
        int y = 2023, m = 12, d = 22;

        String sMon = (m < 10 ? "0" : "") + String.valueOf(m);
        String sDay = (d < 10 ? "0" : "") + String.valueOf(d);
        System.out.printf("%s-%s-%s\n", y, sMon, sDay);
    }
}

