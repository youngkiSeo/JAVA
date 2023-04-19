package com.green.java.ch04;

public class FlowEx18 {
    public static void main(String[] args) {
        int gugudan = 2;

        for(int i=gugudan; i<10; i++){
            //System.out.printf("%d * %d =%d\n",gugudan,i,gugudan*i);

            for(int z =1; z<10; z++){
                System.out.printf("%d * %d = %d\n",gugudan,z, gugudan*z);
            }

            System.out.println();
            gugudan++;
        }



    }
}
