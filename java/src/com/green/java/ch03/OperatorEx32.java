package com.green.java.ch03; // p.105

public class OperatorEx32 {
    public static void main(String[] args) {
        int x = 10, y = -5, z = 0;
        int absX, absY, absZ;
        //abs : 절대값의 줄임말, 음수가 없는 값

        absX = x >= 0 ? x : -x;
        // 불린타입이 맨앞에 와야함

        System.out.println(absX);

        absY = y >= 0 ? y : -y;
        System.out.println(absY);

        absZ = z >= 0 ? z : -z;
        System.out.println(absZ);
    }
}

