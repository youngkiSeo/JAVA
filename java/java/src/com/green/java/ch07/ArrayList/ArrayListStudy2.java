package com.green.java.ch07.ArrayList;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;
        double d =10.2;
        Double d2 = d;

        ArrayList<Integer> list = new ArrayList<>(); //generic 제네릭
        list.add(1);
        list.add(b);

        int n1 = list.get(0);
        System.out.println(list); //14 toString으로 오버라이딩해서 찍힘

    }
}
