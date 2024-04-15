package javabasic;

import java.util.Scanner;

public class Example06_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numberArr = new int[3];

        for(int i = 0; i < 3; i ++){
            numberArr[i] = sc.nextInt();
        }

        int maxNumber = numberArr[0];
        int minNumber = numberArr[0];

        for(int i = 1; i < numberArr.length; i++){
            maxNumber = Math.max(maxNumber,numberArr[i]);
            minNumber = Math.min(minNumber,numberArr[i]);
        }
        System.out.println(maxNumber + "" + minNumber);

    }
}
