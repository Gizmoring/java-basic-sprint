package com.choongang;

public class B_GetLastElement {
    public int getLastElement(int[] arr) {
        // TODO:

        //배열을 입력받아 마지막 요소를 리턴해야한다
        //빈배열을 입력받는 경우 -1을 리턴해야한다
        //배열의 마지막 인덱스는 length-1이다 따라서 마지막 인덱스는 입력받은 arr배열의 length-1 의 인덱스를 가진다

        if (arr.length == 0) {
            return -1;
        } else {
            return arr[arr.length - 1];
        }
    }
}

