package com.green.java.baekjoon;

import java.util.Scanner;

public class b17284 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []vedingmachine = {500,800,1000};
        int money = 5000;
        for (int i = 0; i <3; i++) {
            int button = scan.nextInt();
            money-=vedingmachine[button-1];
        }
        System.out.println(money);
    }
}
