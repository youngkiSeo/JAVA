package com.green.java.baekjoon;

import java.util.Arrays;
import java.util.Scanner;
public class b26905 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int [] items = new int [input];
        for (int i = 0; i <items.length; i++) {
            items[i]= scan.nextInt();
        }
        int num = 0;
        int idx = 0;

        for (int i = 0; i < items.length; i++) {

            for (int z = 1; z < items.length; z++) {
                if (items[z-1] > items[z]) {
                    num = items[z-1];
                    items[z-1] = items[z];
                    items[z] = num;
                    idx++;
                }
            }
        }
        System.out.println(idx);

    }
}
