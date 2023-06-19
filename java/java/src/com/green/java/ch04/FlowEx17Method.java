package com.green.java.ch04;

public class FlowEx17Method {
    public static void main(String[] args) {
        int star =5;
        int star2=5;
        printStarLine(star);
        printStarLine(3);
        printStarRect(3);
        printStarTri(4);
        printStartriangle(star);


    }
    public static void printStarLine(int star){
        for (int i = 0; i <star; i++) {
            System.out.print("*");
        }
        System.out.println();

    }


    public static void printStarRect(int star){
        System.out.println("");
        for (int i = 0; i <star; i++) {
            printStarLine(star);
        }
    }
    public static void printStarTri(int star){
        System.out.println();
        for (int i = 1; i <=star; i++) {
            printStarLine(i);
        }
    }
    public static void printStartriangle(int star){
        System.out.println();
        for (int i = 0; i <star; i++) {
            for (int j = i+1; j <star; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
