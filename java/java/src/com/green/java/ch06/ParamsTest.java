package com.green.java.ch06;

public class ParamsTest {
    public static void main(String[] args) {
        int num = 10;
        Numberbox nb = new Numberbox(); // Numberbox 객체 주소값만 저장
        nb.num=10;
        System.out.println(num);
        changeNum2(nb);
        System.out.println(nb.num);
    }
        static void changeNum(int num){
            num=20;
        }
        static  Numberbox changeNum2(Numberbox nb2){
            nb2.num=20;
            System.out.println("nb2 num = "+nb2.num);
            return nb2;
        }

}
class  Numberbox {
    int num;
}
