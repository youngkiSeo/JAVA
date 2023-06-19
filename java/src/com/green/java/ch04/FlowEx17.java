package com.green.java.ch04;

public class FlowEx17 {
    public static void main(String[] args) {
        int star = 5;
        printStarLine(star);
        printStarLine(3);
        System.out.println("-------------------");
        printStarRect(4);
        System.out.println("-------------------");
        printStarTri(4);
    }


    public static void printStarLine(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");

        }
        System.out.println();
    }


    public static void printStarRect(int star) {

        for (int i = 0; i < star; i++) {
            printStarLine(star);
//            for (int j = 0; j < star; j++) {
//                System.out.print("*");

            }
            System.out.println();
        }

        public static void printStarTri(int star){
            for (int i = 1; i <= star; i++) {
                printStarLine(i);
            }
//                for (int j = 0; j <= i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//            System.out.println();
        }
    }


