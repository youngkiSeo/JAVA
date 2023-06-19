package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy1 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        //받는 타입이 오브젝트. 모든 타입의 변수를 다 담을수있다.
        //뭐가 나올지 몰라서 타입을 기억하고 알맞게 쳐야한다.
        //ArrayList list = new ArrayList();
        //실무에서 이렇게 안써요~~!!

        list.add(10); //0번방
        list.add(20); // 1번방
        list.add("ddd");// Object타입은 모든 타입이 들어갈수있다.


        Object obj = 10;

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(obj);

        int n1  = (int)list.get(0);
        int n2  = (int)list.get(1);
        String str1  = (String)list.get(2);// 같은 타입으로 입력해야 출력이된다.
}
}