package com.green.java.ch04;
import java.util.Scanner;

public class FlowEx27_1 {
    public static void main(String[] args) {
        int num;
        int sum=0;
        boolean flag =true; // while 조건식으로 사용하세요.
        Scanner scan = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0)");
        while (true){
            num= scan.nextInt();
            if(num==0){
                break;
            }sum += num;

        }System.out.println(sum);
    }
}