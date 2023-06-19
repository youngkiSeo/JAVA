package ch03;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++; // i:6, j:5
        System.out.printf("i: %d, j: %d\n", i, j);

        int i2 = 5, j2 = 0;
        j2 = ++i2;
        System.out.printf("i: %d, j: %d\n", i2, j2);// i:6, j:6
    }
}
