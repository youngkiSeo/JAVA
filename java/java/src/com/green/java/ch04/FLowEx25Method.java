package com.green.java.ch04;
import java.util.Scanner;
public class FLowEx25Method {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345)>");
        String temp = scan.nextLine();
        int sum = sumStringNumber(temp);
        System.out.printf("각 자리수의 합: %d \n ", sum);

    }
    public static int sumStringNumber(String temp){//선언부
        int num= Integer.parseInt(temp);
        int sum=0;
        while(num !=0){
            sum+= num%10;

            num/=10;
        }
        return  sum;
    }
}
