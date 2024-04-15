package javabasic;

public class Example01 {
    public static void main(String[] args) {

        int a = 0;
        //8bit = 1byte
        //-128 ~ 127 0포함
        //byte < short < int < long < float < double
        //2byte 4byte 8byte           //소수점 15자리까지 표현가능
        //char 타입에 숫자를 넣으면 해당하는 유니코드의 문자로 바뀜
        int intVariable;
        intVariable = 21000000;
        intVariable = Integer.MAX_VALUE;
        intVariable = Integer.MIN_VALUE;

        Integer integerVariable = 21000000;
        // null 값도 받을 수 있음

        double b = 3.1;
        char c = 'y';
        boolean d = false;
        // 원시타입 4개를 제외하고 전부 참조타입
        String str = "youngjin";
        // 참조타입
        // str = new String("java"); 생성자에요 문자열은 자주쓰니까
        // str.charAt(2); u 를반환 2번 인덱스니까
        // 문자열에서 제공하는 메서드()이다}
    }
}
