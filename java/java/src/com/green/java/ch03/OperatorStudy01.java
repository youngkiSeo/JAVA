package com.green.java.ch03;

public class OperatorStudy01 {
    public static void main(String[] args) {
        int num = 5; // 변수 타입 꼭 넣기 필수
        int result = (4 + num) * 3; // 사칙연산 따름 * 먼저 계산, 괄호 있을시 괄호가 먼저!
        System.out.println(result);

        result = 11 / num;
        System.out.println(result);

        result =  result - 1;
        System.out.println(result);

        result = 13 % num; // %(mod라고 칭함) 짝수인지 홀수인지 체크할떄 사용, 2로 나눴을떄 0이나오면 짝수, 1이나오면 홀수
        System.out.println(result);




    }
}
