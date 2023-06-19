package ch04;

import java.util.Scanner;

public class SwitchStudy1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("사용하는 브라우저를 입력해주세요 :  ");
        String browser = scan.nextLine();
        browser = browser.toLowerCase().toLowerCase();
        //toLowerCase() 전부 소문자로 바꿔주는 메소드/ .replaceAll() 빈칸을 전부 없애주는 메소드. // trim()양쪽 빈칸을 없애줌
        switch (browser) {
            case "edge":
                System.out.println("Edge를 사용하고 계시네요");
                break;
            case"chrome":
            case "fireFox":
            case "safari":
            case "opera":
                System.out.println("저희 서비스가 지원하는 브라우저 입니다.");
                break;

            default:
                System.out.println("지원하는 브라우저가 아닙니다.");
                break;



        }




        //Switch(스위치에서만 문자열비교 이퀄스안써도됨)
        //Edge > " Edge를 사용하고 계시네요"
        //Chrom, Firefox, Safari, Opera를 입혁했다면 >
        // "저희 서비스가 지원하는 브라우저 입니다."

        //이 외 내용을 입력했다면 > "지원하는 브라우저가 아닙니다."
    }}