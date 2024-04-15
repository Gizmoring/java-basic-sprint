//package com.choongang;
//
//import java.util.Arrays;
//
//public class R_CreatePhoneNumber {
//    public String createPhoneNumber(int[] arr) {
//        // TODO:
//        /**
//         * arr.length8
//         * result는 자동으로 앞에"(010)"이 추가되어야 함
//         * arr = [1, 2, 3, 4, 5, 6, 7, 8,] -> "1234 - 5678"
//         * arr를 숭회하면서 각 인덱스의 값을 result에 더해줍니다
//         * 이 경우 자동으로 문자열로 형변환 될것
//         * but중간에 -가 추가되어야 하는데, 항상i가 3일때 숫자에 뒤에 해당합니다.
//         * 이 부분만 조건문으로 잘 작성한다면 해걸할 수 있을 것 같다
//         * else -> 자동으로 arr.length =11
//         * arr = [0, 1, 1, 8, 7, 6, 5, 4, 3, 2, 1]
//         * result = 문자열이나, 앞의(011)도 실제로 arr에서 가져와야 합니다.
//         * result의 초기 값은 빈 문자열로 넣어야 형변환이 쉬워짐
//         * 특정한 경우가 총 3가지
//         * 1. i = 0일 떄는 숫자 앞에 "("가 들어와야 합니다.
//         * 2. i = 2일 때는 숫자 뒤에 ")"가 들어와야 합니다.
//         * 3. i = 6일 때는 숫자 뒤에 -이 들어와야 합니다.
//         *
//         */
//        String result = "";
//        if (arr.length == 8) {
//            result = "(010)";
//
//            for (int i = 0; i < arr.length; i++) {
//                if (i == 3){
//                    result = result + i + "-";
//                }else {
//                    result = result + i;
//                }
//            }a
//        }else {
//            for(int i = 0; i )
//        }
//    }
//}
