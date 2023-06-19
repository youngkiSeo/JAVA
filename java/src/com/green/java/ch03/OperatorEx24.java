package com.green.java.ch03; // p.105

public class OperatorEx24 {
    public static void main(String[] args) {
        // '&&' and 엔드 연산자 (모두 true여야만 true, 하나라도 false면 false)
        // '||' or 오알 연산자 (전부다 false여야만 false, 하나라도 true면 true)
        // (2 > 1) && (3 > 2)     true
        // (2 > 1) && (3 > 2) && (3 >= 5)    false

        // (2 > 1) || (3 > 2) || (3 >= 5)    true

        boolean r1 = (2 >1) && (3 > 2);
        System.out.printf("r1 : %b\n", r1);

        boolean r2 = (2 > 1) && (3 > 2) && (3 >= 5);
        System.out.printf("r2 : %b\n", r2);

        boolean r3 = (2 > 1) || (3 > 2) || (3 >= 5);
        System.out.printf("r3 : %b\n", r3);

        boolean r4 = (2 > 1) || (3 > 2) && (3 >= 5);
        System.out.printf("r3 : %b\n", r3);
        //앞에서부터 비교하고 결과갚을 뒤에 값이랑 비교. 아니면 소괄호로 먼저 비교원하는 부분 묶어주기.
    }
}

