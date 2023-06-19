package com.green.java.ch04;


import java.util.Scanner;

/*
합계를 구할 숫자를 입력하세요. (끝내려면 0)
>> 100
>> 200
>> 300
>> 0
합계: 600
 */



// 숫자 합계
// '0'을 입력하면 와일문에서 나올수있게

public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true; // while 조건식으로 사용하세요.

        Scanner scan = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0)");

            while(flag){
                System.out.print(">> ");
                num = scan.nextInt();

                if(num==0) {
                    flag = false;
                }else {
                    sum += num;

                }
            }
            System.out.println("합계는: " + sum);

    }
}








//        System.out.print(">>");
//
//
//        while(flag){
//            num = scan.nextInt();
//            sum += num;
//            System.out.print(">>");
//            if (num == 0) {
//                flag = false;
//            }
//        }
//        System.out.println("합계: " + sum);
//        }
//    }
