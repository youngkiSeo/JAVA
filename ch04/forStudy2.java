package com.green.java.ch04;

public class forStudy2 {
    public static void main(String[] args) {
        //for문 이용
        //1,2,3,4,5 (마지막 콤마 없음)

        /*
        for(int i=5; i<6; i++){
            for(int y=1; y<5; y++){
                System.out.print(y+ ",");
            }
            System.out.println(i);
        }
        */

        /*
        for(int i=1; i<6; i++){
            System.out.print(i);
            if(i<5){
                System.out.print(", ");
            }
        }
        */


        for(int i =1; i<6; i++){
            if(i>1){
                System.out.print(", ");
            }
            System.out.print(i);
        }
    }
}
