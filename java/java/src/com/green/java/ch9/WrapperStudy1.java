package com.green.java.ch9;

public class WrapperStudy1 {
    public static void main(String[] args) {
        //정수형 > byte short int long
        // 실수형 float double
        //문자형 char
        /// 불린형 boolean

        Integer i1 =10;
        int i2 = 10;
        System.out.println(i1 == i2);
        String s1 = Integer.toString(i2); //toString은 static이다. 메소드이다. 매개변수는 int형

        Integer.toString(i2);
        Byte b1 =10;
        short sh1= 10;
        long l1 = 10L;
        long l2 = 10;
        Float f1 = 10.1f;
        Double d1 = 10.1;

        Character c1 = 'c';
        Boolean bl1 = true;
    }
}
