package com.green.java.ch05;
//p.214

public class MultiArrayStudy2 {
    public static void main(String[] args) {
        int[][] mArr = new int[4][3];

        for (int i = 0; i < mArr.length; i++) {
            for (int z = 0; z < mArr[1].length; z++) {
                mArr[i][z] = i * mArr[i].length + (z + 1);

            }

        }
        for (int i = 0; i < mArr.length; i++) {
            System.out.printf("{ %d", mArr[i][0]);
            for (int z = 1; z < mArr[1].length; z++) {
                System.out.printf(", %d", mArr[i][z]);
            }
            System.out.println(" }");

        }
    }
}

//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12}
//                i*3=(z+1)

