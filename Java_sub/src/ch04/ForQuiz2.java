package ch04;

public class ForQuiz2 {
    public static void main(String[] args) {
        //*****
        //*****
        //*****
        //*****
        //*****

        int star = 5;
        final int ROW_CNT = 5;
        int max = star * star;
        for (int i = 1; i <= max; i++) {
            System.out.print("*");
            if (i % ROW_CNT == 0) {
                System.out.println();
            }
        }
        System.out.println("---------------");



            int star2 = 5;
            for (int j = 0; j < star2; j++) {
                for (int k = 0; k < star2; k++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }



