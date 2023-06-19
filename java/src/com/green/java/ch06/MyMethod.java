package com.green.java.ch06;

public class MyMethod {
    //void > return type: 뱉어내는 타입
    // void = 리턴형(외부값은 받는데 뱉어내는ㄱㅔ없다), void없으면 비리턴형
    //sum > method name, 메소드명
    //(int n1, int n2) > parameter, 파라미터, 매개변수, 외부에서 값을 받아내는 문같은곳
    void sum(int n1, int n2) {
        if(n1 == 20) {
            return;
        }
        System.out.println(n1 + n2);
        return;
    }

    int sum2(int n1, int n2) {
        return n1 + n2;
    }

}
