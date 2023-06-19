package com.green.java.ch04;

public class flowEx13Method {
    public static void main(String[] args) {
       //최소값~ 최대값 사이의 값을 전부 더하고 출력
        printAllSum(1,100);
        printAllSum(2,3);
    }
    public static void printAllSum(int min, int mix){
        int sum=0;
        for(int i =min; i<=mix; i++){
            sum+=i;
        }
        System.out.printf("%d ~ %d sum = %d \n",min,mix, sum);
    }
}