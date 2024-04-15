//import java.util.Arrays;
//
//public class Example05 {
//    public static void main(String[] args) {
//        // 1부터 100까지 정수를 담을 배열을 하나 생성해주고 짝수만 담을 배열을 만들어서 그 안에 넣어줄거야
//        // int [] arr = new int[100]; = 0을 할당한 100개의 배열을 만들었어
////        int [] arr = new int[]{100}; = 100이나오네
//        // 이제 로직을 짤거야
//        // arr[0] = 1
//        // arr[1] = 2 -> evenarr[0] = 2
//        // arr[2] = 3
//        // arr[3] = 4 -> evenarr[1] = 4
//        // arr[4] = 5
//        // arr[5] = 6 -> evenarr[2] = 6
//        // 여기서 유추할 수 있는건 evenarr[0] , 1 2 에 들어갈 arr인덱스는 변수 x 2 +1 을 도출 할 수 있다.
//        // ... arr[99] = 100
//
//        int[] arr = new int[100];
//        int[] evenarr = new int[50];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 1 + i;
//            for (int j = 0; j < evenarr.length; j++){
//                evenarr[j] = arr[j*2+1];
//            }
//        }
//
//
//        System.out.println(Arrays.toString(evenarr
//        ));
//
//    }
//}