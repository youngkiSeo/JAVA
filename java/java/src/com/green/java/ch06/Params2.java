package com.green.java.ch06;

class IntBox{
    int n;
    String s;
}

public class Params2 {
    public static void main(String[] args) {
        IntBox ib1 =new IntBox();
        ib1.n=11;
        IntBox ib2 =new IntBox();
        ib2.n=22;
        ib1 =ib2;
        System.out.println(ib1.n);
        System.out.println(ib2.n);
        //IntBox ib3 =new IntBox();
        changeIntBox(ib1);
        System.out.println(ib1.n);
    }
    public static void changeIntBox(IntBox ib){
        ib.n=33;
    }
}
