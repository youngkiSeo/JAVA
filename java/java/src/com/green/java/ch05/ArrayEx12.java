package com.green.java.ch05;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = { "kim", "Park", "Yi" };
        for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%d]: %s\n", i, names[i]);
        }

        names[0] = "yu";
        for (String nm : names) {
            System.out.println(nm);

        }
    }
}
