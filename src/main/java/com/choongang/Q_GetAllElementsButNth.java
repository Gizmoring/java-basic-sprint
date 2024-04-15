//package com.choongang;
//import java.util.*;
//public class Q_GetAllElementsButNth {
//    public int[] getAllElementsButNth(int[] arr, int n) {
//        // TODO:
//        // arr = []일 경우 빈배열을 반환해야함
//        if(arr.length == 0) {
//            result = new int[0];
//        }
//        else if(arr.length < n){
//            result = Arrays.copyOf(arr, arr.length);
//        }
//        // arr.length보다 n이 크다면 arr를 그대로 반환해야함
//        //[ 1, 2, 3, 4, 5, 6 ]
//        // n = 2라면
//        // result = [1, 2, 4, 5, 6] 즉 arr[n]만 제외한 배열을 만들어야 함
//        // result의 크기는 arr.length -1
//
//        result = new int[arr.length - 1];
//
//        // arr[1, 2] 를 먼저 순회하고
//        // result[0] = arr[0];
//        // result[1] = arr[1];
//        // 즉 result[i] = arr[i]
//        // 반복문 순회는 0부터 n까지만 순회
//        for(int i = 0; i < n; i++){
//            result[i] = arr[i];
//        }
//        //arr[1, 2, 3, 4, 5, 6]애서 3번 인덱스 부터 마지막까지 을 순회하여 값을 result에 넣음
//        // 현재 result = [ 1 2 0 0 0]
//        // result[2] = arr[3]
//        // result[3] = arr[4] ...
//        // result[i - 1] = arr[i];
//        // for문은 n+1부터 시작해서 마지막까지 순회해야함
//        for(int i = n + 1; 1 < arr.length; i++){
//            result[ i - 1 ]
//        }
//
//        }
//}
