package com.green.java.baekjoon;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class b3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int num = 0;
        boolean bl;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            bl = false; // 기본값 초기화
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    bl = true;
                    break;
                }
            }
            if (bl == false) {
                num++;
            }

        }
        System.out.println(num);
    }
}
