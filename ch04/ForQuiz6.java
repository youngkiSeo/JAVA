package com.green.java.ch04;

public class ForQuiz6 {
    public static void main(String[] args) {
        // 2*1=2 \t 3*1=3

        for(int i=1; i<10; i++){
            for (int z=2; z<10; z++){
                System.out.printf("%d X %d = %d\t", z,i,z*i );
            }
            System.out.println();
        }
    }
}
