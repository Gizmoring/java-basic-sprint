package javabasic;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        // 1.사용자로부터 숫자를 입력받을 떄는 scanner를 쓸거니까 객채를 하나 만들어준다.
        // 1-1 숫자를 입력받을 객체를 input하고 거기에 할당할거야
        // 1-2 인풋에 int 형태로 받아야하니 input.으로 스캐너메소드를 호출해서 int로 받을거야
        //2. 가장 많이 거를 수 있는 0을 시작으로 음수인지 양수인지 조건문을 쓸거야
        // 2-1 0일때는 0이라고 출력해줄거야
        // 2-2 0이 아니면 입력받은 input이 0보다 크다면 양수
        // 2-3 아니라면 음수라고 출력할거야

        Scanner input = new Scanner(System.in);

        if (input.nextInt() == 0) {
            System.out.println("입력받은 수는 0입니다.");
        } else if (input.nextInt() > 0) {
            System.out.println("입력받은 수는 양수입니다.");
        } else {
            System.out.println("입력받은 수는 음수입니다.");
        }

    }


}

