package com.green.java.ch04;

public class FlowEx17 {
    public static void main(String[] args) {
        int star =5;
        int star2=5;

        for(int i=0; i<=star; i++){

            for(int z=0; z<i; z++){
                System.out.print(" ");
            }
            for(int j=star2; j>0; j--){
                System.out.print("*");
            }
            System.out.println();

            star2--;

        }

    }
}
