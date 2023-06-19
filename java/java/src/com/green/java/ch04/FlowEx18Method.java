package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {
        //gugudan(4);
        gugudan(2,8);
        //arguments 아규먼츠 인수값

    }

    //오버로딩
    public static void gugudan(int num,int num2){
        for (int i = 0; i <=num2-num; i++) {
            gugudan(num+i);
            System.out.println();
        }
    }

//    public static void gugudan(int num,int num2){
//        for (int i = num; i <num2; i++) {
//            gugudan(i);
//            System.out.println();
//        }
//    }

    public static void gugudan(int num){ //인자 피라미터 매개변수
        for(int z =1; z<10; z++){
            System.out.printf("%d * %d = %d\n",num,z, num*z);
        }
    }

    public static void gugudan2(int num){
        System.out.println();
        for(int i=num; i<10; i++){
            gugudan(num);
            System.out.println();
            num++;
        }
    }
}
