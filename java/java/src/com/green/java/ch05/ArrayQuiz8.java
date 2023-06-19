package com.green.java.ch05;


// "ctrl + shift + alt + l" 코들 정렬 단축기
/*
    numArr 배열을 이용하여
    Arrays.toString 메소드 이용하지 않고
    아래처럼 출력되도록 로직으로 해결하세요.
    [11, 14, 2, 7, 36, 35]
 */
public class ArrayQuiz8 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int[] copyArr = new int[numArr.length];

        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = numArr[i];
        }
        for (int j = 0; j < copyArr.length; j++) {
            System.out.printf("copyArr[%d] > %d\n", j, copyArr[j]);
        }
    }
}



//        int[] copyArr = new int[rNumArr.length];
//
//        for (int i = 0; i < ; i++) {
//        for (int i = 0; i < copyArr.length; i++) {
//            copyArr[i] = rNumArr[i];
//        }
//            for (int j = 0; j < copyArr.length; j++) {
//                System.out.printf("copyArr[%d] > [%d}\n", j, copyArr[j]);
//            }
//        }
//    }
//

//        int[] copyArr = new int[rNumArr.length];
//
//        for (int i = 0; i < copyArr.length; i++) {
//            copyArr[i] = rNumArr[i];
//        }
//        for (int i = 0; i < copyArr.length; i++) {
//            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);
//        }
//    }
//}


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

