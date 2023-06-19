package com.green.java.ch08;

public class TryCatchStudy3 {
    public static void main(String[] args) {
        int r = div(10, 5);
        System.out.println("r : " + r);
    }

    public static int div(int n1, int n2) {
        int r = 0;
        try {
            r = n1/ n2;
            if(r % 2 == 0 ) {return 100;}
        } catch (Exception e) {
            e.printStackTrace();
           // System.out.println("예외 발생");
        } finally {
            System.out.println("파이널리");
        }
        System.out.println("끝!");
        return  r;
       // System.out.println("끝!");
    }
}

//catch에 여러구문이있다면 Exception이 무조건 실행되기때문에 제일 밑에 위치해야한다!
//catch문에서 가장 위에있는 구문만 실행되고 finally로 빠져나온다.