package javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class Example09 {
    public static void main(String[] args) {

        int num;
        int result = 0;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for(int i = 1; i <= num; i++){
            result += i;
        }
        System.out.println(result);
    }




}
