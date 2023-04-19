package com.green.java.ch03;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j =0;

        j= i ++; // i를 먼저 읽고 J를 읽음 고로 J++
        System.out.printf("j=i++; 실행 후 i =%d, j = %d\n", i , j);


        int i2=5, j2=0;
        j2 = ++i2; // 쓰기 -> 읽기
        System.out.printf("j2=++i2; 실행 후 i2 =%d, j2 = %d\n", i2 , j2);


    }
}
