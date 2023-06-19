package com.green.java.ch03;

import java.util.Scanner;

public class OperatorStudy09 {
    public static void main(String[] args) {
        int i=0;

        i++;
        System.out.println("i : " + 1);

        int z = 0;
        z = z + 1;
        z = z + 1;
        z = z + 2;
        System.out.println("z : " + z);

        int k = 0;
        k += 1;
        k += 2;
        System.out.println("k : " + k);
        // z = z + 1; 이랑 z += 1; 이랑같은맥락
    }
}
