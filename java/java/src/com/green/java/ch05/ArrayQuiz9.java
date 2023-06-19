package com.green.java.ch05;


import java.util.Arrays;

/*
numArr 배열을 이용하여
0번, 1번방 값 스와이핑.

값 리터럴 적지않는다
 */
public class ArrayQuiz9 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int j = numArr[0];
        numArr[0] = numArr[1];
        numArr[1] = j;
        System.out.println(Arrays.toString(numArr));
        }
}
























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

