package com.green.java.ch06;

public class TvTest5 {
    static String brand="안";

    public static void main(String[] args) {
        //static이 붙으면 값을 하나 밖에 저장 못함

        Tv tv1 = new Tv();
        Tv tv2= new Tv();

        tv1.color = "black";
        tv2.color = "red";
        tv1.brand="현대";
        tv2.brand="기아";
        Tv.brand="폭스바겐";
        TvTest5.brand="안녕";
        //static은 class 메모리 영역이 따로있음


        System.out.println(tv1.color+" "+tv2.color);
        System.out.println(tv1.brand+" "+tv2.brand);
        System.out.println(TvTest5.brand);


    }
}
