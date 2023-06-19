package com.green.java.ch05;


import java.util.Arrays;

/*
    numArr 배열을 섞어주세요.
 */
public class ArrayQuiz12 {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        for(int i=0; i<numArr.length; i++) {
            int rIdx = (int)(Math.random() * numArr.length);
            if(i == rIdx) { continue; }
            int temp = numArr[i];
            numArr[i] = numArr[rIdx];
            numArr[rIdx] = temp;
        }

        System.out.println(Arrays.toString(numArr));
    }
}







/* [0] 랜덤돌려서 나오는 숫자의 [?]이랑 바꾼다.
 */























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

