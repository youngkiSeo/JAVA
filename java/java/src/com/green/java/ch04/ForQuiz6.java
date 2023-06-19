// 2 x 1 = 2 3 x 1 = 3 4 x 1 = 4 ....... 9 x 1 = 9
// 2 x 2 = 2 3 x 2 = 3 4 x 2 = 4 ....... 9 x 2 = 9
// 2 x 3 = 2 3 x 3 = 3 4 x 3 = 4 ....... 9 x 3 = 9
//.................
// 2 x 9 = 2 3 x 9 = 3 4 x 9 = 4 ....... 9 x 9 = 9




package com.green.java.ch04;

import java.util.Scanner;

public class ForQuiz6 {
    public static void main(String[] args) {

        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j > 1; j--) {
                System.out.printf("%d x %d = %d\t", j, i, (j * i));
            }
            System.out.println();

            }

        }

//        for (int i = 1; i < 10; i++) {
//            for (int j = 2; j < 10; j++) {
//                System.out.printf("%d X %d = %d\t", j, i, (j*i));
//            }
//            System.out.println();
//        }

        }


