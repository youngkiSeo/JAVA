package com.green.java.ch05;


import java.util.Arrays;

// "ctrl + shift + alt + l" 코들 정렬 단축기
/*
    numArr 배열을 이용하여
    copyArr에 numArr보다 1칸 더 많게 만들어주세요.
    마지막 방에는 100을 넣어주세요
    copyArr에 numArr을 deep copy해주세요.


(String result = Arrays.toString(copyArr);
            System.out.println(result);)
 */

public class ArrayQuiz7 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int[] copyArr = new int[numArr.length + 1];
        copyArr[numArr.length] = 100;
        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }
        String result = Arrays.toString(copyArr);
        System.out.println(result);

    }
}

//
//        int[] copyArr = new int[numArr.length + 1];
//
//        copyArr[numArr.length] = 100;
//        //copyArr[ copyArr.length - 1] = 100
//
//        for (int i = 0; i < numArr.length; i++) {
//            copyArr[i] = numArr[i];
//            }
//            String result = Arrays.toString(copyArr);
//            System.out.println(result);
//        }
//    }






















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

