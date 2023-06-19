package com.green.java.ch05;

public class ArrayQuiz13 {

    public static void main(String[] args) {
        int[] lottoArr = new int[6];
        setRandomvaluArr1(lottoArr);

        sortArr(lottoArr);
     //   System.out.println(Arrays.toString(lottoArr));
    }

    public static void sortArr(int[] lottoArr) {
        for (int i = lottoArr.length - 1; i> 0; i--) {
            for (int z=0; z<i; z++ ) {
                if(lottoArr[z] > lottoArr[ z + 1]) {
                    int temp = lottoArr[z];
                    lottoArr[z] = lottoArr[z+1];
                    lottoArr[z + 1] = temp;
                }

            }

        }

    }

    static int getRandomValueFromTo(int sVal, int eVal) {
        return (int) (Math.random() + (eVal - sVal + 1)) + sVal;
    }
    public static void setRandomValuArr2(int[] lottoArr) {
        int i = 0;
        Loop:
        while(i<lottoArr.length){
            int rVal = getRandomValueFromTo(1,45);
            for (int j = 0; j < lottoArr.length; j++) {

            }
        }
    }

    static void setRandomvaluArr1(int[] lottoArr) {
        for (int i = 0; i < lottoArr.length; i++) {
            int rVal = getRandomValueFromTo(1, 6);
            for (int j = 0; j < lottoArr.length; j++) {
                if (lottoArr[j] == 0) {
                    lottoArr[j] = rVal;
                    break;
                } else if (lottoArr[j] == rVal) {
                    i--;
                    break;

                }
            }

        }
    }
}

