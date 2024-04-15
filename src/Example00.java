//import java.util.Scanner;
//
//public class Example00 {
//    public static void main(String[] args) {
////
////        //각 타입이 가진 변수를 선언하고 할당
////
////        // 정수형 데이터타입 int 변수 a에 10을 선언하고 할당했다.
////        // 1byte = 8bit를 가지며 데이터타입 int는 4byte를 가지고 2의32승만큼인 약 42억개의 수를 나타낼 수 있다.
////        // 데이터타입의 크기는
////        // byte short int long float double 순이고 1byte는  -128 부터 0포함 127까지 256개의 수를 나타낸다
////        // 상수를 선언할 떄는 final 그리고 대문자로 나타낸다
////        int a = 10;
////        // 실수형 데이터타입 double 변수 b에 3.14를 선언하고 할당했다.
////        // 약 소숫점 15자리까지 반환가능하다.
////        double b = 3.14;
////        // 문자형 데이터타입 char 변수 c에 문자열임을 알리는 'a' 를 선언하고 할당했다.
////        // 만일 문자형타입 변수에 '1' 이 담긴다면 이것은 숫자1이 아니고 유니코드형식으로 저장된다.
////        char c = 'a';
////        // boolean 형 데이터타입 변수 d에 false를 선언하고 할당했다 - > true or false 만 할당가능하다
////        boolean d = false;
////        // 위 4개의 타입은 원시타입이라불린다
////        // 이하 모든 데이터타입은 참조형데이터타입이라 불리며 생성된 클래스또한 데이터타입이되며
////        // 참조형데이터타입은 생성하면 각각 주소값을 가지기 때문에 객체를 생성해서 사용해야한다.
////        String str = "김영진";
////        //문자열 데이터타입 String 의 변수 str에는 문자열을 나타내는 "김영진" 을 할당해주었다
////
////        //두개 의 int 변수를 선언하고 이들의 합 곱 나눗셈의 결과를 출력하는 프로그램
////        // 합 빼기 곱 나눗셈의 결과를 출력해야하니 sout 을 써서 나타내겠다
////
////        // 어떤수가 들어갈 지 몰라 선언만하고 할당은하지않았다
////        // 엔트리포인트가없어서 출력이 안되서 psvm으로 만들어줬다
////        // 합 빼기 곱 나눗셈 결과를 담은 변수를 선언해주고 각각 할당한다
//////        int num1;
//////        int num2;
//////
//////        int sum = num1 + num2;
//////        // 초기화가 되지 않아서 변수 sum에 넣어줄 수 없었다
////        // 문제에서는 선언만 요구했고 num1 , num2에 무슨값이 들어갈 지 몰라서 할당은 안해준 상태인데 이렇게는 사용할 수 없는건가요?
////        // feedback ->
////
////        int num1 = 10;
////        int num2 = 3;
////        //결과값을 받을 변수 들을 각각 선언해주는데 정수/정수는 실수가 될 수도 있으니 double타입으로 받겠다
////        int sum = num1 + num2;
////        int subtrac = num1 - num2;
////        double devide = num1 / num2;
////        int multply = num1 * num2;
////        System.out.println(sum);
////        System.out.println(subtrac);
////        System.out.println(devide);
////        System.out.println(multply);
////
////        //이름과 나이를 입력받을 변수를 지정하고
////        // 정보를 화면에 출력할 것이다
//////        // 입력받을 때는 스캐너를 사용할 것이고 참조타입이기 때문에 객체를 생성해준다
////        Scanner name = new Scanner(System.in);
////        Scanner age = new Scanner(System.in);
////        System.out.println("이름은"+name+"나이는"+age.nextInt());
////        //이름은 문자열로 나이는 정수형으로 받겠다
////
//
////        Scanner name = new Scanner(System.in);
////        name.next();
////        Scanner age = new Scanner(System.in);
////        age.nextInt();
////        System.out.println("이름은"+name+"나이는"+age);
//        //변수를 지정해서 활용하는 개념이 부족한 것 같다.
//
//
//        Scanner scan = new Scanner(System.in);
//        // 스캐너 인스턴스를 활용해서 이름을 받을 변수를 name 나이를 받을 변수를 age로 age는 정수로 받겠다.
//        // name = scan.next(); 데이터타입을 지정해주지않았다
//        // 이름을 문자열로 받을 변수 String name 나이를 정수로 받을 변수 int age에 스캐너 인스턴스 를 활용해 클래스 메서드를 호출한다.
//        String name = scan.next();
//        int age = scan.nextInt();
//
//        System.out.println("이름은" + name + "나이는" + age + "입니다.");
//
//
//    }
//}
