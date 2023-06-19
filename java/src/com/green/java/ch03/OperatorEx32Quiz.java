package com.green.java.ch03; // p.105

public class OperatorEx32Quiz {
    public int getAbs(int n) {

        n = n >= 0 ? n : -n;
        return n;


//        if(n >=0) {
//        return n;
//    }
//    return -n;
//     if문
//     3항식   return n >= 0 ? n : -n;

    }

    public static void main(String[] args) {
        int x = 10, y = -5, z = 0;
        int absX, absY, absZ;

        OperatorEx32Quiz oEx32= new OperatorEx32Quiz();

        absX = oEx32.getAbs(x);
        absY = oEx32.getAbs(y);
        absZ = oEx32.getAbs(z);
        //절대값을 구하시오.

        System.out.println("absX : " + absX);
        System.out.println("absY : " + absY);
        System.out.println("absZ : " + absZ);
    }
}

//
//    static int getAbs(int val) {
//
//        val = val >= 0 ? val : -val;
//        return val;
//    }
//}

