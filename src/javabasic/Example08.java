package javabasic;

import java.util.Arrays;

public class Example08 {

    public static void main(String[] args) {


        int[] arr = new int[100];
        int[] evenarr = new int[50];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if (arr[i] % 2 == 0) {
                for (int j = 0; j < evenarr.length; j++) {
                    evenarr[j] = arr[j * 2 + 1];
                }
            }
        }
        System.out.println(Arrays.toString(evenarr));


        // i = 0 -> arrays[0] = 1
        // i = 1 -> arrays[1] = 2  -> evenarray[0] = arrays[1] = 2
        // i = 2 -> arrays[2] = 3
        // i = 3 -> arrays[3] = 4  -> evenarray[1] = arrays[3] = 4
        // i = 4 -> arrays[4] = 5
        // i = 5 -> arrays[5] = 6  -> evenarray[2] = arrays[5] = 4
        // i*2+1


    }


}
