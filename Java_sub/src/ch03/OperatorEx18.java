package ch03;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.541592;

        //long r1 = Math.round(pi);
        System.out.println("Math.round(pi)" + Math.round(pi)); //round:  반올림
        System.out.println("Math.round(3.5111)" + Math.round(3.5111));
        System.out.println("Math.ceil(pi)" + Math.ceil(pi)); // ceil: 무조건 올림
        System.out.println("Math.ceil(3.0001) : " + Math.ceil(3.0001)); // 조금만있어도 무조건 올림
        System.out.println("Math.floor(3.0001) : " + Math.floor(3.0001)); //
        System.out.println("Math.floor(3.9999) : " + Math.floor(3.9999)); //

    }
}
