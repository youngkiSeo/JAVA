package com.green.java.ch05;

import javax.swing.plaf.basic.BasicSplitPaneUI;

/*
    번호  국어  영어  수학  총점  평균
    ==============================
    1   100    90    80  270   90.0
    2    20    20    20   60   20.0
    ...
    ==============================
    총점
    국어: 190
    영어: 180
    수학: 170
 */
public class ArrayEx19 {
    public static void main(String[] args) {
//        System.out.print("번호 \t");
      String[] titles = {"국어\t", "영어\t", "수학\t", "사회\t"};
//        int[] title = new int[titles.length];

        int sum = 0;
        float avg = 0;

        int[][] score = {
                 {100, 90, 80, 10}
                , {20, 20, 20, 20}
                , {30, 30, 30, 30}
                , {40, 40, 40, 40}
        };
        System.out.println("번호  국어  영어  수학  사회  총점  평균");

        System.out.println("=====================================");

        for (int i = 0; i < score.length; i++) {
            sum = 0;
            System.out.printf("%d", i + 1);
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                avg = (float) sum / score[i].length;
                System.out.printf("%6d", score[i][j]);
            }

//                avg = 0;
            System.out.printf("%6d\t", sum);
            System.out.printf("  %.2f\n", avg);
        }
        System.out.println("=====================================");
        System.out.println("총점\n");

        for (int i = 0; i < score.length; i++) {
            sum = 0;
            for (int j = 0; j < score[i].length; j++) {
            sum += score[j][i];

        }

            System.out.println(titles[i] + sum);
        }


    }
}





//    };
//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < score[i].length; j++) {
//
//                System.out.printf("%3d",score[i][j]);
//
//
//            }
//
//        }
//}
//
//
//
//
//
//
//
//

//        String[] titles = { "국어", "영어", "수학", "사회" };
//        int[] titleSumArr = new int[titles.length];
//        int[][] score = {
//                { 100, 90, 80, 10 }
//                , {  20, 20, 20, 20 }
//                , {  30, 30, 30, 30 }
//                , {  40, 40, 40, 40 }
//        };
//        System.out.print("번호\t");

//        for(int i=0; i<titles.length; i++) {
//            System.out.printf("%s\t", titles[i]);
//        }
//        System.out.println("총점\t평균");
//        System.out.println("==============================");
//        for(int i=0; i<score.length; i++) {
//            int[] eachScore = score[i];
//            int sum = 0;
//            System.out.printf("%3d\t", i + 1);
//            for(int z=0; z<eachScore.length; z++) {
//                int jumsu = eachScore[z];
//                //int jumsu = score[i][z];
//                System.out.printf("%3d\t", jumsu);
//                sum += jumsu;
//                titleSumArr[z] += jumsu;
//            }
//            System.out.printf("%3d\t%4.1f\n", sum, ((double)sum / eachScore.length));
//        }
//        System.out.println("==============================");
//        System.out.println("총점");
//        for(int i=0; i<titles.length; i++) {
//            System.out.printf("%s: %d\n", titles[i], titleSumArr[i]);
//        }
//
//
//        String str = "ab2d43";
//        char[] charArr = str.toCharArray();
//        System.out.printf("%c", charArr[1]);
//
//
//    }
//}
//
//
