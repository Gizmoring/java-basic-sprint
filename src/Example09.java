//import java.util.Arrays;
//
//public class Example09 {
//    public static void main(String[] args) {
//        //주어진 정수 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성해라.
//        //배열을 하나 만들어 주고
//
//        int [] maxmin = new int[]{2,3,5,6,1};
//
//        System.out.println(Arrays.toString(maxmin));
//
//        // 기준점을 0인덱스로 잡고 비교해가면서 큰수만 남기면 최댓값 반대면 최솟값
//        // 최댓값 최솟값을 받아준 변수를 선언해둔다
//        int max;
//
//        //maxmin[0] > maxmin[1] = maxmin[0]
//        //maxmin[0] > maxmin[2] = maxmin[0]
//        //maxmin[0] < maxmin[3] = maxmin[3]
//
//        for(int i = 0; i < maxmin.length; i ++){
//            if( maxmin[i] > maxmin[i+1]){
//                max = maxmin[i];
//                System.out.println(max);
//            }
//        }
//        // 최댓값은 나오는데 maxmin[i+1] 의 범위가 벗어나서 오류가 있다..
//        // 해결하려고 별짓을 다해봤는데 잘 안대네..
//
//    }
//}
