package cw2.zad5;

import cw2.exception.ValidationException;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Adress adress;
    private List<Book> books = new ArrayList<>();

    public Person(String name, String surname, LocalDate dateOfBirth, Adress adress) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
    }

    public List<Book> getBooks() {
        return books;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isEmpty()) {
            throw new ValidationException("Name cannot be empty");
        }

        this.name = name;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {


        if (surname == null || surname.isEmpty()) {
            throw new ValidationException("surname cannot be empty");
        }

        this.surname = surname;
    }

    public Period getAge() {
        return Period.between(dateOfBirth, LocalDate.now());
    }


    public Book PublishBook(String name, Genre genre, Lang lang, LocalDate publishDate) {

        Book book1 = new Book(name, genre, lang, publishDate, Person.this);
        book1.setAuthor(this);
        books.add(book1);

        return book1;
    }

    public Adress getAdress() {
        return adress;
    }

    public void PublishBook() {

        Book book1 = new Book();
        book1.setAuthor(this);
        books.add(book1);

    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", adress=" + adress +
                '}';
    }
}
