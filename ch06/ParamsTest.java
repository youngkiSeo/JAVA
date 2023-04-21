package com.green.java.ch06;

public class ParamsTest {
    public static void main(String[] args) {
        int num = 10;
        Numberbox nb = new Numberbox();
        nb.num=10;
        changeNum2(nb);
        System.out.println(nb.num);

    }
        static void changeNum(int num){
            num=20;
        }
        static void changeNum2(Numberbox nb2){
            nb2.num=20;
            System.out.println("nb2 num = "+nb2.num);
        }

}
class  Numberbox {
    int num;

        }
