package com.green.java.ch05;


/*
    numArr 배열을 이용하여
    배열에 들어있는 값 평균값 구해주세요.
    소수점은 있다면 2자리까지
    avg: ??
 */
public class ArrayQuiz11 {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }

        double avg = (double)sum / numArr.length;

        System.out.printf("sum: %d, avg: %f\n", sum, avg);

    }
}


//
//        int a = 0;
//        for (int i = 0; i < numArr.length; i++) {
//            int temp = (int) (Math.random() * numArr.length); // 1이 나왔다 가장 ='14'
//            a = numArr[temp]; // temp = 14 -> a=14(잠시보관), temp =값이 x
//            numArr[temp] = numArr[i]; // temp = x 에다가 i값을 넣어줘서 채워줌 그러면 temp = 1,  i = x 템프에게 줘버렸으니까 ㅇㅇ
//            numArr[i] = a; //i = x상태임 그래서 아까 들고있던 a(14)를 넣어줌, i = 14 a= 값이 x
//
//        }
//        System.out.println(Arrays.toString(numArr));
//









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

