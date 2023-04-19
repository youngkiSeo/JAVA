package com.green.java.ch04;

public class flowEx13 {
    public static void main(String[] args) {
        int sum= 0;
        for(int i =1; i<11; i++){
            System.out.printf("sum: %d, i: %d \n", sum , i);
            sum+=i;

        }
        System.out.printf("sum: %d", sum);
    }
}
