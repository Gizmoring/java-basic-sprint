package javabasic;

import java.util.Arrays;

public class Example12 {
    public static void main(String[] args) {
        // 주어진 정수의 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성
        int[] arr = {5, 10, -2, 7, 6};
        //arr.length(5)
        // arr[0] = 5
        // arr[1] = 10
        // arr[2] = -2
        // arr[3] = 7
        // arr[4] = 6
        // 각 요소를 비교해서 큰 값이면 갱신하게 만들거야
        // 최댓값받을 변수를 max를 첫번째 인덱스를 기준점으로 잡을거야
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }


        //int[] arr = {5, 10, -2, 7, 6}; 정해진 배열에서 최솟값을 출력할거야
        // 하나씩 비교하면서 작은수를 남길거야 그럼 변수 min을 할당해둬야겠다

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        // arr[0] = 5  min = 5
        // arr[1] = 10
        // arr[2] = -2
        // arr[3] = 7
        // arr[4] = 6


        System.out.println(min);


    }
}
