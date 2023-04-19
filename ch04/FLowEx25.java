package com.green.java.ch04;

import java.util.Scanner;

public class FLowEx25 {
    public static void main(String[] args) {
        int num=0, sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345)>");
        String temp = scan.nextLine();
        num = Integer.parseInt(temp);

        while(num !=0){
            sum+=num%10;
            //num= num/10;

            num/=10;
        }
        System.out.println("각 자리 수의 합: "+ sum);



    }
}
