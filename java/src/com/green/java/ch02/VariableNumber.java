package com.green.java.ch02;
public class VariableNumber {
    public static void main(String[] args) {
        //변수 정수형(소수점이 없을시 정수, 소수점 있을시 실수)
        byte b1; //1byte // 0,1만 저장 3자리까지 가능(전기가 있으면1, 없으면0), 실제 잘 사용하지않음
        short s1;  //2byte
        long l1; // 8byte // int가 사용할수있는 범위를 넘어설시 long을 사용
        int n1; //(정수형) 변수 선언 // 4byte CPU가 사용하는게 4byte라서 속도가 가장 빠름
        //int n1; // 변수 선언은 1번만 가능.
        n1 = 10; //=는 대입연산자, 오른쪽값 복사하여 왼쪽에 주입, 리터럴(literal)이란 소스 코드의 고정된 값을 나타내는 표기법
        System.out.println(n1);

        n1 = 20;
        System.out.println(n1);

    }
}