package javabasic;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {

        // 10개의 정수값을 저장할 수 있는 배열을 만든다.
        int[] arr = new int[10];
        // for문으로 집어 넣어준다
        // arr[0] = 1
        // arr[1] = 2
        // arr[3] = 3
        // 헙을 받을 변수 result 선언

        int result;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));
    }


}



