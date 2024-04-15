package javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        //스캐너를 통해서 입력을 받겠다.
//        String name = scan.next();
//        // name 을 int로 받아서 트루라면 그 받은 타입으로 변환 할 수 없을까
//       String name = scan.next();
//        {
//
//            System.out.println("이름은" + name + "입니다" + "\n나이는" + age + "살입니다");
//        }
//    }
//}
        // 이름에 숫자가 들어왔을 때 잘못된 입력입니다. 출력후 종료
        // 메소드를 만들자 "0123456789" 를 잘못된 출력입니다.
        // 그리고 인트를 문자열로 바꾸고 그걸 숫자로 바꾸자
        // 두번째 받은 문자열을 "0123456789" 가 있다면 반환해서 나이로 넣어주자.
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        if (!nameValid(name)) {
            System.out.println("잘못된 입력입니다");
        } else {
            System.out.println("이름은" + name + "입니다.");
        }
        String age = scan.next();
        if(!ageValid(age)){
            System.out.println("잘못된 입력입니다");
        } else {
            System.out.println("나이는" + age + "입니다.");
        }

    }

    //name Valid == true 잘못된입력입니다. -> 이름에 숫자가 들어가있으니까

    public static boolean nameValid(String str) {
        String lookuptable = "0123456789";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < lookuptable.length(); j++) {
                if (str.charAt(i) == lookuptable.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean ageValid(String str){
        String lookuptable = "0123456789";
        for(char c : str.toCharArray()){
            if(lookuptable.indexOf(c) == -1){
                return false;





            }

        } return true;
        // 입력받은 str.toCharArray()을 문자배열로받겠다
        // str = "a1b2"
        // Char c - ['a','1','b','2'] = str.toCharArray()
        //
  // lookuptable. indexOf(매개변수) 매개변수가 lookuptable안에 있다면 그 위치에 인덱스를 출력한다 없다면 -1을 출력한다
    }
}
//
// 문자열은 문자에 접근할 수 있다.