package com.green.java.ch04;

public class forStudy4 {
    public static void main(String[] args) {
        int star =5;

        for(int i=star; i>0; i--){
            for(int z=1; z<=star; z++){
                if(z < i ){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();



        }
    }
}
