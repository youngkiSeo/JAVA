package com.green.java.ch08;

public class TryCatchStudy4 {
    public static void main(String[] args) {
        int type = 1;
        try{
            Exception e = new Exception("고의로 예외발생");
            System.out.println("ddd");

            if (type == 0){
                throw e;
            }
            else if (type == 1){throw new ArithmeticException("dd");}
        }catch (ArithmeticException e){

        }
        catch (Exception e){
            System.out.println("arithmetic 에러메시지: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("끝!");
    }
}
