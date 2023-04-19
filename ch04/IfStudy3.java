package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy3 {
    public static void main(String[] args) {
        final int WOMAN_HEIGHT_STAND = 158;
        final int MAN_HEIGHT_STAND = 171;

        Scanner scan = new Scanner(System.in);
        System.out.print("성별 입력(w,m): ");

        String gender = scan.nextLine();
        System.out.print("키 입력(cm):");
        int height = scan.nextInt();


        if (gender.equals("m")) {
            if (height == MAN_HEIGHT_STAND ) {
                System.out.println("남자, 평균입니다");
            }
             else if (height > MAN_HEIGHT_STAND ) {
                System.out.println("남자, 평균초과입니다.");
            }else if (height < MAN_HEIGHT_STAND ) {
                System.out.println("남자, 평균이하");
            } else {
                System.out.println("범위 오류");
            }
        }else if (gender.equals("w")) {
            if (height == WOMAN_HEIGHT_STAND) {
                System.out.println("여자, 평균입니다.");
            } else if (height > WOMAN_HEIGHT_STAND) {
                System.out.println("여자 평균 초과입니다.");
            } else if (height < WOMAN_HEIGHT_STAND) {
                System.out.println("여자, 평균이하입니다.");
            } else {
                System.out.println("범위 오류");
            }
        }

            int stand =0;
            if(gender.equals("w")){
                stand = WOMAN_HEIGHT_STAND;
                System.out.print("여자, ");
            } else if (gender.equals("m")){
                stand = MAN_HEIGHT_STAND;
                System.out.print("남자, ");
            }

            if(height>stand){
                System.out.println("평균초과입니다.");
            } else if (height<stand) {
                System.out.println("평균미만입니다");

            }else {
                System.out.println("평균입니다");
            }


        }
    }
