package ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        boolean r1 = false && 10 / 0 > 0 && false; // &&연산자는 전부 true여야 true/ false를 앞에두기
        System.out.println(r1);
        boolean r2 = true || 10 / 0 > 0 || true; // 하나만 트루면 트루 /트루를 앞에두기
        System.out.println(r2);


        //double d = 10 / 0; // 0으로 절대 나눌수 없음
        boolean d = 10 / 0 > 0;

    }
}
