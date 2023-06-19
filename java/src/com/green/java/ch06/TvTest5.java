package com.green.java.ch06;


public class TvTest5 {
    static String brand;
    //final은 무조건 값을 초기화해줘야한다.

    public static void main(String[] args) {
      Tv tv1 = new Tv();
      Tv tv2 = new Tv();

      tv1.color = "black";
      tv1.color = "red";
        tv1.brand = "현대";
        tv2.brand = "기아";
        Tv.brand = "폭스바겐";


        System.out.println("tv1.color = " + tv1.color);
        System.out.println("tv1.color = " + tv2.color);
        System.out.println("tv1.brand = " + tv1.brand);
        System.out.println("tv1.brand = " + tv2.brand);
    }
}