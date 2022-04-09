package cw2.zad5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Person person1=new Person("Piotr","nowak", LocalDate.now(), new Adress("Poland","Warsaw","koszykowa",1,2));



        Book book2= new Book("nn",Genre.Adventure,Lang.Polish,LocalDate.now(),person1);

        person1.PublishBook();
        person1.PublishBook();


        book2.BorrowBook(person1);
        book2.PlaceBack();

        book2.BorrowBook(person1);

        System.out.println(book2.getBorrowCount());
        System.out.println(book2.getBorrowPerson());

        System.out.println(person1.getBooks().get(0).getAuthor());
        System.out.println(person1.getBooks().get(1).getAuthor());

        person1.getBooks().get(0).setAuthor("Janek","kowalski",LocalDate.now(),new Adress("a","b","c",1 ,1));

        System.out.println(person1.getBooks().get(0).getAuthor());
        System.out.println(person1.getBooks().get(1).getAuthor());
        System.out.println(book2);
    }
}
