package com.green.java.ch04;

/*

 [1, 1] [1, 2] [1, 3]
 [2, 1] [2, 2] [2, 3]
 [3, 1] [3, 2] [3, 3]

 */

public class FlowEx21 {
    public static void main(String[] args) {
        int num = 4;
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num; j++) {
                System.out.printf("[%d, %d] ", i, j);

            }
            System.out.println();
        }

    }
}



//        for (int i = 3; i > 0 ; i--) {
//            for (int j = 3; j > 0 ; j--) {
//                System.out.printf("[%d, %d] ", i, j);
//            }
//            System.out.println();
//
//            }
//
//        }