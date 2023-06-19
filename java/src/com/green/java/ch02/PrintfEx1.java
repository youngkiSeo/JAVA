package com.green.java.ch02;

public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';
        boolean bl = true;
        int finger = 10;

        System.out.printf("b=%d\n", b); // 계행은 \n 또는 %n 둘다 사용가능
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c,(int)c);
        System.out.printf("finger=[%5d} \n", finger); // 5칸 설정했을떄 최소 5칸 보장이라는 뜻, 넘는 칸은 넘는대로 다 프린트됨(6자리는 6자리나옴)
        System.out.printf("finger=[%-5d} \n", finger);
        System.out.printf("finger=[%05d} \n", finger);

        int gana = 900222;
        double kim = 1.123456789;
        String url = "http://www.instagram.com/hi__naya__";
        System.out.printf("d=%f\n", kim);
        System.out.printf("d=%.3f\n", kim);
        System.out.printf("%s\n", url);
        System.out.printf("%30s\n", url);
        System.out.printf("%-30s\n", url);

    }
}
