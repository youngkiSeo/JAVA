package com.green.java.ch05;

public class ArrayStudy1 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러값을 저장하기 위한 공간
        int[] n1 = new int[5];
        int[] numArr = {10, 20, 30};
        // int 형 배열  // 10이 0번방에 들어감
        int numArr2[] = {10, 20}; //C언어

        numArr[0] = 11;
        int num = numArr[0];
        System.out.println(num);


    }
}
