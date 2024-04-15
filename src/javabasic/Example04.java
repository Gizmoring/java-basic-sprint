package javabasic;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {

        double num1;
        double num2;
        String oper;
        double result;


        Scanner scan1 = new Scanner(System.in);
        num1 = scan1.nextDouble();

        Scanner operator = new Scanner(System.in);
        oper = operator.next();

        Scanner scan2 = new Scanner(System.in);
        num2 = scan2.nextDouble();


        switch (oper) {
            case "+":
                result = (num1 + num2);
                System.out.println(result);
                break;

            case "-":
                result = (num1 - num2);
                System.out.println(result);
                break;

            case "*":
                result = (num1 * num2);
                System.out.println(result);
                break;

            case "/":
                if(num2 == 0){
                    System.out.println("0으로는 나눌 수 없습니다.");
                }else{
                    result = num1/num2;
                    System.out.println(result);
                    break;
                }
        }

    }
}
