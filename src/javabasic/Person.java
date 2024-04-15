package javabasic;

public class Person {
    public String name;
    public int age;

public Person (String name, int age){
    this.name = name;
    // this 는 클래스라는 뜻이고 호출한 클래스로 돌아간다
    this.age = age;
}

public void output(String name, int age) {
    System.out.println(name + age);
}


}

