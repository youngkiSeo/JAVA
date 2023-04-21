package com.green.java.ch06;

import java.io.PrintStream;

public class MymethodTest {
    public static void main(String[] args) {
        Mymethod mymethod =new Mymethod();
        mymethod.sum(1,2);


        int result = mymethod.sum2(19,23);
        System.out.println(result);

        PrintStream ps = System.out;
        ps.println("result2 : " + result);
    }
}
