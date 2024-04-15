package javabasic;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
// 세개의 숫자를 입력 받아야 합니다
        // 스캐너 객체 선언 할당
        // 입력받은 값을 할당할 변수 3개를 선언
        // 가장큰정수를 할당할 변수를 선언
        // 가장작은 정수를 할당할 변수를 선언;
        int num1;
        int num2;
        int num3;
        int max;
        int min;
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        max = maxNumber(num1,num2,num3);
        System.out.println("가장 큰 수는 " + max + "입니다.");
        min = minNumber(num1,num2,num3);
        System.out.println("가장 작은 수는" + min + "입니다.");

    }

    public static int maxNumber(int num1, int num2, int num3) {
        int max;

        if (num1 >= num2 && num1 > num3) {
            max = num1;
        } else if (num1 <= num2 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        return max;
    }

    public static int minNumber(int num1, int num2, int num3){
        int min;

        if (num1 <= num2 && num1 < num3){
            min = num1;
        } else if (num1 >= num2 && num2 < num3) {
            min = num2;}
        else {
            min = num3;
        } return min;
    }







}








