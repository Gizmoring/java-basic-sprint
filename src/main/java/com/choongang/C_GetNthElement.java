package com.choongang;

public class C_GetNthElement {
    public int getNthElement(int[] arr, int index) {
        // TODO:
        //배열의 수를 입력받아 수가 인덱스로 가리키는 배열의 요소를 리턴해야한다
        //빈배열을 입력받은 경우 -1을 리턴해야한다
        //배열의 길이가 벗어나는 수를 입력받은 경우 -2를 리턴해야한다
        // index로 들어온 수가 인덱스로 가르키는  입력받은 arr 인덱스의 요소를 리턴해야한다
        // arr.length == 0 일때 -1을 리턴해야한다
        // index 가 arr의 길이보다 크거나 같다면 arr의 인덱스범위를 벗어나므로 -2를 리턴해야한다

        if (arr.length == 0){
            return -1;
        } else if (index >= arr.length) {
            return -2;
        }else{
            return arr[index];
        }
    }
}
