package com.green.java.ch03;

public class OperatorEx01 {
    public static void main(String[] args) {
        int i = 5;
        i++; // ++는 숫자값 하나 올릴때 사용가능(숫자만가능), --하나내릴때. (앞에 또는 뒤에 사용가능, 하지만 앞뒤로는 사용불가)
        i++; // 두번 실행시 숫자값 두번 올라감
        System.out.println(i);

        i = 5;
        ++i;
        System.out.println(i);
    }
}
