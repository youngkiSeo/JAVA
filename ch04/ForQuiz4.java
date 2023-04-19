package com.green.java.ch04;

import java.util.Scanner;

public class ForQuiz4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int star = scan.nextInt();
        int star2=1;

        for(int i=0; i<5; i++){

            for(int z=star; z>0; z--){

                System.out.print(" ");

            }
            for(int z=1; z<star2; z++ ){
             System.out.print("*");
            }

            System.out.println();
            star--;
            star2++;


        }
    }
}
