package com.green.java.practice;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class _01_Array {
    public static void main(String[] args) {
        String[][] seats3 = new String[10][15];
        char c = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(c) + (j + 1);
            }
            c++;
        }
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) { // 가로
                System.out.print(seats3[i][j] + " ");  // A1 A2 A3...
            }
            System.out.println();

        }

    }
}
