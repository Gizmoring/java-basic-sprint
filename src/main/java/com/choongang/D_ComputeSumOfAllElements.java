package com.choongang;

public class D_ComputeSumOfAllElements {
    public int computeSumOfAllElements(int[] arr) {
        // TODO:
        // 배열의 입력받아 모든 요소의 합을 int 타입으로 리턴해야한다
        // 입력받은 arr 배열의 요소에 자기자신을 더해나가면서 반복해가야한다
        // 합을 받을 변수를 int sum = 0;으로 할당해준다
        // 빈배열인경우 0을 리턴해야한다
        int sum = 0;
        if (arr.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
