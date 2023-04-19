package com.green.java.ch04;

public class IfStudy1 {
    public static void main(String[] args) {
        int num = 1;
        //boolean 타입만 들어 갈 수 있음 ture만이 실행함
        if(num==10){
            System.out.println("num은 10입니다");

        } else {
            System.out.println("num은 10이 아니다");
        }

        int num2 = 10;
        if(num2 >= 20){
            System.out.println("num은 20이상");
        }else if(num2>=10){
            System.out.println("num은 10이상");
        }else {
            System.out.println("num은 5미만");
        }
    }
}
