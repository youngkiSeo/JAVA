package ch04;

public class ForQuiz5 {
    public static void main(String[] args) {
//        //int dan = 5;
//        printGugudan(5);
//        //'.'이 없다는것은 주소값이없다. 같은 클래스 안에있는 메소드이다(static).
//
//        //5 x 1 = 5
//        // .....
//        //5 x 9 = 45
//    }
//
//    static void printGugudan(int five) {
//        for (int i = 1; i <= 9; i++) {
//            System.out.printf("%d x %d = %d\n", five, i, (five * i));
//
//        }
//
//
//        int dan = 6;
//        printGugudan(dan);

        printGugudan(2, 8);
    }

    static void printGugudan(int sDan, int eDan) {
        for (int i = sDan; i <= eDan; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i * j));
            }
            System.out.println();
        }
    }
}

