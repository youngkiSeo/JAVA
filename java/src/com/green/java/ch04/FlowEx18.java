package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx18 {
    public static void main(String[] args) {

        //중첩 for문을 이용하여 2~9단 구구단을 출력
        // 단수가 바뀌면 빈칸 한 줄 추가






        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j < 10; j++) {
                System.out.printf(" %d x %d = %d\n", i, j, (i * j));
            }
            System.out.println();
        }
    }
}


    // 첫째값 * 둘째값 구해야함//