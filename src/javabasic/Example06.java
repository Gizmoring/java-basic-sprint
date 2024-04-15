package javabasic;

public class Example06 {
    public static void main(String[] args) {
        //논리 연산자 && || ! 를 수행할 예제를 작성하시오.
        //비교할 대상 3개를 정해서 비교하자

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 > num2 && num1 > num3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (num1 > num2 || num3 > num2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (num1 > num2 != num2 > num3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
