//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Example08 {
//    public static void main(String[] args) {
//// 5명의 학생의 점수를 입력받아 배열에 입력
//        // Scanner 클래스 메서드를 호출하기위해 인스턴스를 만들어주고
//        // 점수를 받아 정수타입의 5개 변수에 할당하고
//        // 정수형 배열 score에 저장해서 전부더해서 나누면 평균값이 된다
//        // 그리고 평균값을 double everage에 담아 출력한다 - 나눴을 떄 실수일수도있어서
//
//        Scanner scan = new Scanner(System.in);
//
//        int student1 = scan.nextInt();
//        int student2 = scan.nextInt();
//        int student3 = scan.nextInt();
//        int student4 = scan.nextInt();
//        int student5 = scan.nextInt();
//        //그럼 입력받을때마다 배열에 바로넣을수있지않을까?
//        // n명의 학생이라 하고 int n으로 둔뒤에
//        // int [] score = new int[n]; n의 크기를 가진 배열에 입력할때마다 바로바로는 넣을 수 없을까?
// // 저번에 선생님이 ...이들어가면 베열이라는 걸 인식해서
//        // int [] score = new int[1...n] 이런느낌으로 되지않을까
//        int [] score = new int[5];
//        score[0] = student1;
//        score[1] = student2;
//        score[2] = student3;
//        score[3] = student4;
//        score[4] = student5;
//
//        double everage = 0;
//        for(int i = 0; i < score.length; i++){
//            everage += score[i];
//        }
//        System.out.println(everage/5);
//
//    }
//}
