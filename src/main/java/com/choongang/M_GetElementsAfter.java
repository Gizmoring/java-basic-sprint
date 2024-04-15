//package com.choongang;
//
//import java.util.Arrays;
//
//public class M_GetElementsAfter {
//    public int[] getElementsAfter(int[] arr, int n) {
//        // TODO:
//        // 결과를 담을 배열 선언
//        // 크기는 n부터 잘라야 하므로
//        // arr.length - n;
//
//        // result = 빈 배열
//        // arr.length <= n
//        // result = 빈배열
//
//        int[] result;
//
//        if (arr.length == 0) {
//            result = new int[0];
//        }
//        else if (arr.length <= n) {
//
//        }
//        // index  0 1 2 3 4
//        // arr   [1 3 5 7 9] 2
//        //            ->
//        // result[0] = arr[2];
//        // result[1] = arr[3];
//        // result[2] = arr[4];
//        // 여기서 유추할 수 있는건
//        // result의 인덱스는 항상 arr의 인덱스 - n
//        // 순회하며 값을 할당해야 합니다
//        // result 에 arr의 값을 할당
//        // arr의 n번 인덱스의 값이 result 0부터 들어와야 합니다
//        // result[ i - n] = arr[i]; -> i가 2부터 시작할테니
//        // 위에서의 i는 for loop 카운트 변수
//        else {
//            result = new int[arr.length - n];
//
//            for (int i = n; i < arr.length; i++) {
//                result[i - n] = arr[i];
//
//                return result;
//            }
//
//        }
//    }
//}