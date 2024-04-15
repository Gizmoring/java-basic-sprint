public class People {
    // People 이라는 클래스를 생성할것이고
    // 필드는 3개 각각 문자열의 name 정수형 age 문자열 birth로 선언한다 - 각 객채의 필드를 다르게 하기 위해 선언만 해둔다
    // People 클래스를 활용해 인스턴스를 만들 때 매개변수를 강제하기 위해 생성자를 만들었고 오버로딩했다
    // name, age or name birth or name age birth 세 케이스중 하나는 매개변수를 넣어햐 객체가 생성되게할거다
    // infomation 이라는 매소드를 생성하고 반환하는타입은 없이 바로 출력할것이고 넣어야하는 매개변수는 name birth age이다
    // sleep 이라는 메소드역시 void 타입으로 넣어야하는 매개변수는 name이다.
    public String name;
    public int age;
    public String birth;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People(String name, String birth) {
        this.name = name;
        this.birth = birth;

    }
    public People(String name, int age, String birth){
        this.name = name;
        this.birth = birth;
        this.age = age;
    }

    public void infomation(String name, int age, String birth) {
        System.out.println("이름은 " + name + "이고" + " 나이는" + age +"살"+ " 생일은 " + birth + " 입니다");

    }
    public void sleep(String name){
        System.out.println(name+"은(는)"+"잠을 잡니다.");
    }


}
