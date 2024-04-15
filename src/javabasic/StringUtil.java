package javabasic;

public class StringUtil {

    public static String reverse(String str) {
        //받은 문자열을 거꾸로 넣어준다 길이는 str.length()까지 순서는 반복을 돌면서 맨앞으로
        // ex) abcde -- > a > e, b > d, c > c, d > b, e > a
        //
        String result = "";
        for (int i = 1; i <= str.length(); i++) {
            result += str.charAt(str.length() - i);

        }
        return result;
    }

    public static String concat(String str, String str1) {
        String result = "";
        result = str + str1;
        return result;
    }

    public static String concat(String str, String str1, String str2) {
        String result = "";
        result = str + str1 + str2;
        return result;
    }


    public static String contains(String str, Character str2) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str2) {
                result = "문자를 포함합니다";
            }
        }return result;
    }
}
