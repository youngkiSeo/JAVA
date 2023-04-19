package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx21 {
    public static void main(String[] args) {
        for(int i=1; i<6; i++){
            for(int z=1; z<6; z++){
                if(i==z) {
                    System.out.print("" + "[" + i + "," + z + "]");
                }else {
                    System.out.print("     ");
                }

            }
            System.out.println();
        }

        Scanner scan= new Scanner(System.in);
        int N= scan.nextInt();

        for(int i=1; i<=N; i++){
            for(int z=1; z<=N; z++) {
                if (i == z) {
                    System.out.printf("[%d,%d]", i, z);
                }else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }

    }
}
