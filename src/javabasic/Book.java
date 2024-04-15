package javabasic;

public class Book {
    public String title;
    public String author;
    public int price;

    public Book(){};

    public void output(String title, String author ,int price){

        System.out.println("책이름"+title+"작가"+author+"가격"+price);

    }

}
