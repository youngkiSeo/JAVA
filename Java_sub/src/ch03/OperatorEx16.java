package ch03;

public class OperatorEx16 {
    public static void main(String[] args) {
        double val = 12.345678;
        System.out.printf("%.2f\n", val);

        String result = String.format("%.2f\n", val);
        System.out.println("result : " + result);
    }
}
