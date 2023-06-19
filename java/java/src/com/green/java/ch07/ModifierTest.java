package com.green.java.ch07;

public class ModifierTest {

        private int num1; //private은 class를 벗어나면 접근 불가능 맴버필드는 private 상수만. 보통 static붙음
        int num2; //default 실무에서 사용안함 같은 package면 사용가능
        protected int num3; //생성자에 못붙임
        public int num4; //생성자는 public 맴버필드한테 public 한테 못줌

        public void printNum1() {
                System.out.println(num1); //내부용
        }
}
