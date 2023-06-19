package com.green.java.ch06;

public class Call {
    static class Student{
        int kor, eng, math;

        public Student(int kor, int eng, int math) {

            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public String toString() {
            return "Student [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
        }


    }

    static void increase(Student s) {
        s.eng += 10;
        s.math += 20;
    }

    public static void main(String[] args) {

        Student student = new Student(10, 10, 10);

        System.out.println("increase 호출 전");
        System.out.println(student.toString());

        increase(student);
        System.out.println("increase 호출 후");
        System.out.println(student.toString());
    }
}
