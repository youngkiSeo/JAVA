package ch04;

import java.util.Scanner;

public class ifStudy3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int PRICE = 10_000;
        System.out.println("나이를 입력해 주세요: ");
        int age = scan.nextInt();
        int calcPrice = PRICE;
        int sale = 0;

        if (age < 20) {
            sale = (int) (calcPrice * 0.1);
        } else if (age >= 30) {
            sale = (int) (calcPrice * 0.2);
        }
        System.out.printf("%d세의 나이는 ", age);
        if (sale > 0)
            calcPrice -= sale;
        System.out.printf("원금 %,d에서 할인금액 미용금액 %d원입니다.\n", sale, calcPrice);
        System.out.printf("%d의 나이는 미용금액 %d원입니다.",age,calcPrice);


        }
    }

//        if (age < 20) {
//            sale *= 0.1;
//            calcPrice *= 0.9;
//            System.out.printf("%d의 나이는 원금 %d에서 할인금액 %d을 제외한 미용금액 %d원입니다.", age, PRICE, sale, calcPrice);
//        } else if (age >= 30) {
//            sale *= 0.2;
//            calcPrice *= 0.9;
//            System.out.printf("%d의 나이는 원금 %d에서 할인금액 %d을 제외한 미용금액 %d원입니다.", age, PRICE, sale, calcPrice);
//        } else {
//            System.out.printf("%d의 나이는 미용금액 %d원입니다.", age, calcPrice);
//        }
//    }
//}
//10000 * 0.1 = 10%
//20미만이면 10%할인 금액 (0.9)  9,000
//몇세의 나이는 원금 10,000원에서 할인금액 1,000을 제외한 9,000원입니다.
//30이상이면 20%할인 금액 (0.8)  8,000
//몇세의 나이는 원금 10,000원에서 할인금액 2,000을 제외한 8,000원입니다.
//나머지는 10,000원 출력
//몇세의 나이는 미용금액 1,000원입니다.

//(천단위 콤마)






