package com.green.java.ch06;

public class MyMathTest {
    public static void main(String[] args) {
        int n1=10, n2 =22;

        MyMathInstance mmi = new MyMathInstance();
        int sum1 =mmi.sum(n1,n2);
        int sum2 =MyMathstatic.sum(n1,n2);
        System.out.println("Instance 클래스의 sum 메서드: "+sum1);
        System.out.println("Static 클래스에 있는 sum메서드: "+sum2);

    }
}
