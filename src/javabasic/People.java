package javabasic;

public class People {
    public static void main(String[] args) {

        Person people = new Person("김영진", 31);
        // 클래스의 메서드를 불러오러면 그 클래스의 객체가 필요하기 떄문에
        // new + 생성자(클래스이름) 으로 객체를 만들어준다.

        Person people2 = new Person("고경범", 30);

        people.output("김영진",31);

        Book bookinfo = new Book();
        
        bookinfo.output("혼공자","고경범",30000);


    }



}
