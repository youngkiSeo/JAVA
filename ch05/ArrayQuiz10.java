package com.green.java.ch05;

public class ArrayQuiz10 {
    public static void main(String[] args) {
        int [] numArr= {11, 14, 2, 7, 36, 35};
        int min=numArr[0];
        for(int i=0; i<numArr.length; i++){
            if(min>numArr[i]) {
                min = numArr[i];
            }
        }
        System.out.println("min: "+min);
    }
}
