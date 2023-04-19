package com.green.java.ch05;
/*
 번호 국어 영어 수학 총점 평균
 =========================
 1 100 100 100    300  100.0
 */

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {100,90,80}, {20,20,20}, {30,30,30}, {40,40,40},
        };
        int []total= new int[score.length];
        int []gug_yeongsu=new int[score.length];

        int vag=0;

        System.out.println("번호  국어  영어   수학  총점  평균");
        System.out.println("===============================");
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d   ",i+1);

            for (int z = 0; z < score[i].length; z++) {
                if(score[i][z]>99) {
                    System.out.printf(" %d  ", score[i][z]);
                }else {
                    System.out.printf(" %d   ", score[i][z]);
                }
                total[i]+=score[i][z];
                gug_yeongsu[z]+=score[i][z];
                }
            if(total[i]>99){
                System.out.print(total[i] + "   " + (float)total[i] / 3);
            }else {
                System.out.print(total[i] + "    " + (float)total[i] / 3);
            }

            System.out.println();

        }

        System.out.println("===============================");
        System.out.println("총점");
        System.out.println("국어:"+gug_yeongsu[0]);
        System.out.println("영어:"+gug_yeongsu[1]);
        System.out.println("수학:"+gug_yeongsu[2]);

    }
}
