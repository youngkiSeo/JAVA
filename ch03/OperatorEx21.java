package com.green.java.ch03;

public class OperatorEx21 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.f \t %b\n", 10 == 10.0f);
        System.out.printf("'0'== 0 \t %b \n", '0' == 0);

        System.out.printf("'A'+1 == 'B' \t %b \n", 'A'+1 == 'B');
        System.out.printf("'A'+1 == 'C' \t %b \n", 'A' +1 == 'C' );

        int a = 10;
        String str= "90090";
        int num = Integer.parseInt(str);

        System.out.println(Integer.toString(a));
        System.out.println(Integer.valueOf(a));

        System.out.println(a-num);



    }
}
