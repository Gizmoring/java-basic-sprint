public class Person {
    public static void main(String[] args) {
        People person = new People("김영진",31);
        People person1 = new People("최지영",26,"960101");
        People person2 = new People("김하윤",30,"940624");

        person.infomation("김영진",31,"930610");
        person1.infomation("김하윤",24,"940624");


        person.sleep("김영진");
    }
}
