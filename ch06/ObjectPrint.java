package com.green.java.ch06;

public class ObjectPrint {
    public static void main(String[] args) {
        String str = new String("ABC");
        System.out.println(str); //String 타입의 str주소값을 불러옴

        ValueBox vb =new ValueBox();
        vb.num =10;
        System.out.println(vb);
    }
}
class ValueBox{
    int num;
}
