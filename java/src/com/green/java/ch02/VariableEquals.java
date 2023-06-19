package com.green.java.ch02;

public class VariableEquals {
    public static void main(String[] args) {
       NumberBox nb1 = new NumberBox(10);
       NumberBox nb2 = new NumberBox(10);

       boolean r1 = (nb1 == nb2); //false
        System.out.println("r1 : " + r1);
        boolean r2 = nb1.equals(nb2); // Object에 있는 주소값을 equals로 비교함
        System.out.println("r2 : " + r2);


    }
}

class NumberBox extends Object {
    private int num;
    NumberBox(int num) {
        this.num = num;
    }
    int getNum() {
        return num;
    }

    @Override
    public boolean equals(Object obj){ //r2: obj 상속관계
        if(!(obj instanceof NumberBox)) {
            return false;
        }
        //((NumberBox) obj).getNum();  //타입을 알고있는 값만 호출가능
        NumberBox nb = (NumberBox) obj;
        return this.num == nb.getNum();
    }

}