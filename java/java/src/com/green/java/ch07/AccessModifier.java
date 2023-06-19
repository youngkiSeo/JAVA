package com.green.java.ch07;

public class AccessModifier {
    //제어자
    /*
    <<----
    종류: public, default, protected, private
     --->>

     public: 파일이름과 클래스명이 같을 때만 사용가능
     private: class를 벗어나면 접근 불가능 맴버필드는 private 상수만. 보통 static붙음
     맴버 필드가 private 안붙여도 되는건 상수만 final 가능
     default: 실무에서 사용안함 같은 package면 사용가능
     protected: 클래스 같은패키지 다른패키지라도 상속관계면 가능
      public:  생성자한테 맴버필드한테 public 한테 못줌
     */
    public static void main(String[] args) {
        ModifierTest mt1 = new ModifierTest();
      //  mt1.num1=10; // private
        mt1.num2=20;
        mt1.num3=30;
        mt1.num4=40;
    }
}

