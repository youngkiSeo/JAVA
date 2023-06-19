package com.green.java.ch05;


import java.util.Arrays;

/*
numArr 배열을 이용하여
배열에서 가장 작은 숫자를 찾아내어 출력해 주세요.
min: 2
 */

public class ArrayQuiz10 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int min = numArr[0];
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] < min) {
                min = numArr[i];
            }
        }
        System.out.println(min);
    }
}



//        int min = numArr[0];
//        for (int i = 1; i < numArr.length; i++) {
//            if (numArr[i] < min) {
//                min = numArr[i];
//            }
//        }
//
//            System.out.printf("min: %d\n", min);
//        }
//    }
//
//// 순서대로 비교하면서 작은 숫자에서 비교 스탑





















//        int[] copyArr = new int[rNumArr.length];
//
//        for (int i = 0; i < copyArr.length; i++) {
//            copyArr[i] = rNumArr[i];
//        }
//        for (int j = 0; j < copyArr.length; j++) {
//            System.out.printf("copyArr[%d] > %d\n", j, copyArr[j]);
//        }
//    }
//}
//



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

