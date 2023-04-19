package com.green.java.ch05;
//p.207, p.166 향산된 for문 foreach
public class ArrayEx12 {
    public static void main(String[] args) {

        String [] names = {"kim", "Park", "Vi"};
        String [] temp  = new String[names.length+1];


        for (int i = 0; i <names.length ; i++) {
            System.out.printf("names[%d]: %s\n", i,names[i]);
        }
        int i=0;
        for(String nm: names) {
            System.out.printf("names[%d]: %s\n", i++, nm);
        }
    }
}
