package com.green.java.ch06;

import java.util.Arrays;

public class VarargsTest { //Varargs 가변인자줄임말
    public static void main(String[] args) {
        //자동으로 정수형 배열로 만들어준다.

        sum(1);
        sum(1,3);
        sum(1,3,3);
        sum(1,2,3,4,5,6,7,8,9,10);
    }
    static void sum(int...nums){
        int sum=0;
        int [] Arrsum = new int [nums.length];
//        for (int i = 0; i <nums.length; i++) {
//            Arrsum[i]=i+1;
//            sum+=nums[i];
//        }
        for(int val:nums){
            sum+=val;
        }

        //System.out.print(nums.length);
        //System.out.print(Arrays.toString(Arrsum));
        System.out.println(" = "+sum);

    }
}
