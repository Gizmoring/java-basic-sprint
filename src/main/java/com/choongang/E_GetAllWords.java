package com.choongang;

import java.util.Arrays;

public class E_GetAllWords {
    public String[] getAllWords(String str) {
        // TODO:
        //문자열을 입력받아 문자열을 구성하는 각 단어를 요소로 갖는 배열을 리턴해야한다
        // String 타입을 요소로 가지는 배열을 리턴해야한다
        // 단어는 공백 한칸으로 구분한다
        // 문자열 빈배열을 하나 만들어주고 입력받은 문자열 str을 나눠서 공백한칸으로 구분하게 넣어준다

        String[] words = {};

        words = str.split(" ");

        return words;

    }

}
