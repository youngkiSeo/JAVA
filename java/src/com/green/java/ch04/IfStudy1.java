package com.green.java.ch04;

public class IfStudy1 {
    public static void main(String[] args) {
        int num = 9;
        if (num == 10) {
            System.out.println("num은 10입니다.");
        } else {
            System.out.println("num은 10이 아니다.");
        }

        int num2 = 10;
        if(num2 >= 20) {
            System.out.println("num2은 20이상이다.");
        }else if(num2 >= 10) {
            System.out.println("num2은 10이상이다.");
        }else if (num2 >= 5) {
            System.out.println("num2은 5이상이다.");
        }else {
            System.out.println("num2은 5이하이다.");
        }
        //위에가 한 그룹. if, elseif, else(다 아니면 실행, 유일하게 조건식 없어도됨, else문은 없어도됨).
    }
}