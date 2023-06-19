package com.green.java.ch08;

public class TryCatchStudy2 {
    public static void main(String[] args) {
        String str = "123a";
        try {
            int r1 = 10 / 0;
            int num = Integer.parseInt(str);
        } catch (ArithmeticException e) {
            System.out.println("숫자 예외 발생");
        } catch (NumberFormatException e){
            System.out.println("넘버 포맷 예외 발생");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생");
        } finally {
            System.out.println("파이널리");
        }
        System.out.println("끝!");
    }
}

//catch에 여러구문이있다면 Exception이 무조건 실행되기때문에 제일 밑에 위치해야한다!
//catch문에서 가장 위에있는 구문만 실행되고 finally로 빠져나온다.