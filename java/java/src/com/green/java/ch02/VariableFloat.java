package com.green.java.ch02;

public class VariableFloat {
    public static void main(String[] args) {
        //double(8byte), float(4byte)
        float f1 = 10; // 기본으로 double 타입으로 설정되어있기때문에 실수 기입시 강제변환 안해주면 에러뜸
        System.out.println(f1);

        f1 = (float) 9.77;
        f1 = 9.77f;
        System.out.println(f1);

        long l1 = 100;
        float f2 = l1; //자동형변환, float 4byte, Long 8byte
        System.out.println(f2);

        double d1 = 9.77d;
        double d2 = 9.77D;
        // d는 안적어도 무관하다. 기본 d로 설정되어있기때문에.


    }
}
