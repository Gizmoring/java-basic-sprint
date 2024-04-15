package com.choongang;

public class A_getFirstElement {
    public int getFirstElement(int[] arr) {
        // TODO:
//        배열을 입력받아 배열의 첫번째 요소를 리턴해야한다
//                빈 배열을 받는 경우 -1을 리턴해야한다
//        입력받을 배열은 arr이고 빈배열은 arr.length == 0
//         첫번쨰 요소는 arr배열의 0번 인덱스이다

        if (arr.length == 0) {
            return -1;
        } else {
            return arr[0];
        }
    }
}

