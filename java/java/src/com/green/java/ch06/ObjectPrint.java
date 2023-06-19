package com.green.java.ch06;

public class ObjectPrint extends Object{
    public static void main(String[] args) {
        String str = new String("ABC");
        System.out.println(str); //String 타입의 str주소값을 불러옴
        //String Object에는 return 해주는 메소드가 있음

        ValueBox vb =new ValueBox();
        vb.num =10;
        System.out.println(vb.toString());

    }
}
class ValueBox{
    int num;

    @Override
    public String toString(){
        return String.valueOf(num);
    }
}
