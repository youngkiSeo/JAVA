package com.green.java.ch05;


// "ctrl + shift + alt + l" 코들 정렬 단축기
/*
    numArr 배열을 이용하여
    모든 방의 값 중에 홀수값만 전부 더해서 출력해주세요,
    odd-sum: ??


   sum = ??
 */
/* oddSum = 홀수, evenSum = 짝수
*/


public class ArrayQuiz5 {
    public static void main(String[] args) {
        int[] rNumArr = {11, 14, 2, 7, 36, 35};

//        int oddSum = 0;
//        for (int i = 0; i < rNumArr.length; i++) {
//            if (rNumArr[i]%2 == 1)
//                oddSum += rNumArr[i];
//        }
//
//        System.out.println(oddSum);
//
//    }
//}


        int oddSum = 0;
        for (int i = 0; i < rNumArr.length; i++) {
            if (rNumArr[i] % 2 == 1)
                oddSum += rNumArr[i];
        }

        System.out.printf("odd sum: " + "%d", oddSum);
    }
}







//        int sum = 0;
//        for (int i = 0; i < rNumArr.length; i++) {
//            if(rNumArr[i] < 10 )
//                sum += rNumArr[i];
//
//        }

//        int sum = 0;
//        for (int i = 0; i < rNumArr.length; i++) {
//            if(rNumArr[i] >= 20)
//                sum += rNumArr[i];
//        }
//        System.out.println(sum);

//        int sum = 0;
//        for (int i = 0; i < rNumArr.length; i++) {
//            if (rNumArr[i] % 2 == 1)
//                sum += rNumArr[i];
//        }
//        System.out.printf("odd sum: " + "%d", sum);

