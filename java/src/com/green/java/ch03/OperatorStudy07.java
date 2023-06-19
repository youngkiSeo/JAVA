package com.green.java.ch03;

public class OperatorStudy07 {
    public static void main(String[] args) {
        //미만, 초관<>
        //이하, 이상 <=, => 같은같 포함

        System.out.println("2 < 2 : " + (2 < 2));
        System.out.println("1 < 2 : " + (1 < 2));
        System.out.println("2 <= 2 : " + (2 <= 2));
        System.out.println("1 <= 2 : " + (1 <= 2));
        System.out.println("2 > 2 : " + (2 > 2));
        System.out.println("2 >= 2 : " + (2 >= 2));
        System.out.println("2 == 2 : " + (2 == 2));
        System.out.println("2 == 3 : " + (2 == 3));
        System.out.println("2 != 3 : " + (2 != 3));
        System.out.println("2 != 2 : " + (2 != 2));
        System.out.println("!(2 != 2) : " + !(2 != 2));
        // ! 뒤에는 항상 boolean 타입이 와야함
    }
}
