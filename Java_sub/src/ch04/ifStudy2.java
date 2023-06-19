package ch04;

import java.util.Scanner;

public class ifStudy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int PRICE = 10_000;
        System.out.println("나이를 입력해 주세요: ");
        int age = scan.nextInt();
        int calcPrice = PRICE;

        if (age < 20) {
            calcPrice *= 0.9;
        } else if (age >= 30) {
            calcPrice *= 0.8;
        }
        System.out.printf("%d의 나이의 미용 금액은 %,d입니다",
                age, calcPrice);


//        if (age < 20) {
//            System.out.printf("%.2f", price * 0.9);
//        } else if (age >= 30) {
//            System.out.printf("%.2f", price * 0.8);
//        } else {
//            System.out.println(10_000);

    }

}


//20미만이면 10%할인 금액 (0.9)  9,000
//30이상이면 20%할인 금액 (0.8)  8,000
//나머지는 10,000원 출력
//(천단위 콤마)






