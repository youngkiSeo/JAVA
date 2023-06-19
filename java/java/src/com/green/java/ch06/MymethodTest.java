package com.green.java.ch06;

import java.io.PrintStream;

public class MymethodTest {
    public static void main(String[] args) {
        Mymethod mymethod =new Mymethod();
        mymethod.sum(1,2);


        int result = mymethod.sum2(19,23);
        System.out.println(result);

        PrintStream ps = System.out; //printStream 객체 주솟값만 저장 할 수 있다
        ps.println("result2 : " + result);
    }
}
