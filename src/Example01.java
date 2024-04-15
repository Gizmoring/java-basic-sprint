//import java.util.Scanner;
//
//public class Example01 {
//    public static void main(String[] args) {
//        // 사용자로 부터 두개의 숫자를 입력받아
//        // 스캐너클래스를 활용해야 하기때문에 인스턴스를 만들어주고 각 입력받을 값을 담을 데이터타입 double num1, num2에 할당해줄것이다
//        // 그리고 값을 받을 변수 double result를 지정하고? 안해도 되네..?
//        // 0으로 나눌 경우에는 나눌 수 없다는 예외 메시지를 출력해야한다.
//        // 연산자도 계산을 하려면 연산자도 받아야 하는데 String oper 로 받아서 Swicth문을 작성해 분기를 4개로 나누고 나누기 일때 뒤에 숫자에 0이 들어올 때는 예외메시지를 출력해줘야한다.
//
//        Scanner scan = new Scanner(System.in);
//
//        double num1 = scan.nextInt();
//        double num2 = scan.nextInt();
//        String oper = scan.next();
//
//        // * - / + = oper에 들어와야한다 4개의 분기를 생성해서 나타낼 것이다.
//
//        switch (oper) {
//            case "+":
//                System.out.println(num1 + num2);
//                break;
//            case "-":
//                System.out.println(num1 - num2);
//                break;
//            case "*":
//                System.out.println(num1 * num2);
//                break;
//            case "/":
//                if (num2 == 0) {
//                    System.out.println("잘못된 입력입니다");
//                } else {
//                    System.out.println(num1 / num2);
//                }
//                break;
//
//        }
//    }
//}