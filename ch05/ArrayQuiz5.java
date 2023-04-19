package com.green.java.ch05;

public class ArrayQuiz5 {
    /*
    모든 방값 중에 홀수값만 전부 더해서 출력해 주세요
    odd-sum :??
     */
    public static void main(String[] args) {
        int []numArr = {11, 14, 2, 7, 36, 35};
        int oddSum=0;

        for(int i=0; i<numArr.length; i++){
            if (numArr[i]%2!=0){
                System.out.println(numArr[i]);
                oddSum +=numArr[i];
            }
        }
        System.out.println("odd-sum: "+ oddSum);

    }
}
