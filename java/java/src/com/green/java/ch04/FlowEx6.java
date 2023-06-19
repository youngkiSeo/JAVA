package com.green.java.ch04;

import com.sun.tools.javac.Main;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.println("현재 월을 입혁하세요. (1~12)");
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        String season = "";
        switch (mon) {
            //(switch뒤에는 항상 변수만 넣어야함!-숫자안됨)
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                System.out.println("잘못된 입력");
                break;
        }
        if (!"".equals(season)) {
            System.out.printf("현재의 계절은 %s입니다.", season);

            //빈칸 비교할때는 빈칸을 앞에두기 'if (!"".equals(season))'
        }


        // switch 사용하여
        // mon 값이
        // 3, 4, 5라면 "현재의 계절은 봄입니다."
        // 6, 7, 8라면 "현재의 계절은 봄입니다."
        // 9, 10, 11라면 "현재의 계절은 가을입니다."
        // 12, 1, 2라면 "현재의 계절은 겨울입니다."

    }
}

