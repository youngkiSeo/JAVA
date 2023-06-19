package com.green.java.baekjoon;

import java.util.Scanner;

public class baekjoon_25304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = 0;

        int X = scan.nextInt();
        int N = scan.nextInt();

        for(int i =0; i<N; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int AB= A*B;
            C = C+AB;
        }
        if (X==C){
            System.out.println("YES");
        }
        else
            System.out.println("No");
    }
}
