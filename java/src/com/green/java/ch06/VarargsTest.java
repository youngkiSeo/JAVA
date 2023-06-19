package com.green.java.ch06;


public class VarargsTest {
    public static void main(String[] args) {
        sum(1);
        sum(1, 2);
        sum(1, 2, 3);
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int[] arr = { 1, 2, 3};
        sum(arr) ;
    }

    static void sum(int... nums) {
        //System.out.println(nums.length);
        //배열

        int sum = 0;
        for (int val :
                nums) {
            sum += val;
        }
        System.out.println("sum: " + sum);
    }
}

//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//
//        }
//        System.out.printf("sum: %d\n", sum);




