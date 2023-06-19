package ch04;

import java.util.Scanner;

public class ifStudy1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요.");
        int  num = scan.nextInt();
        String evenOdd = "짝수";
        if(num % 2 == 1 ) {
            evenOdd = "홀수";
        }
            System.out.printf("%d는(은) %s입니다.", num, evenOdd);            System.out.printf("%d는 홀수입니다.", num);
        }


        //입력한 값이 12 > " 12는 짝수입니다."
        //입력한 값이 11 > " 12는 홀수입니다."


    }

