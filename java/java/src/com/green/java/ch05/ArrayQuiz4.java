package com.green.java.ch05;


// "ctrl + shift + alt + l" 코들 정렬 단축기
/*
    numArr 배열을 이용하여
    모든 방의 값을 더해서 출력해주세요


   sum = ??
 */
public class ArrayQuiz4 {
    public static void main(String[] args) {
        int[] rNumArr = {11, 14, 2, 7, 36, 35};


        int sum = 0;
                for (int i = 0; i < rNumArr.length; i++) {
        sum += rNumArr[i];
        }
        System.out.printf("합계: " + "%d", sum);
        }
        }


//        int sum = 0;
//
//        for (int i = 0; i < rNumArr.length; i++) {
//            sum += rNumArr[i];
//        }
//            System.out.println(sum);
//        }
//}
//











