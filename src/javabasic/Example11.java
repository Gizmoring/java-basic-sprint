package javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
     //입력을 받을 스캐너 객체를 만들거야
     //5명이 학생의 점수를 입력받을 배열을 만들거야
     //그 배열에 점수를 더하고 5로 나눌거야

        Scanner input = new Scanner(System.in);
        int [] arr = new int[5];
        //arr[0] = input.nextInt();
        //arr[1] = input.nextInt();
        //arr[2] = input.nextInt();
        //arr[3] = input.nextInt();
        //arr[4] = input.nextInt();

        int result = 0;

        for(int i = 0; i < arr.length; i ++){
            arr[i] = input.nextInt();
            result += arr[i];
        }

        System.out.println(result/arr.length);
    }






}
