package cw2.zad5;

import cw2.exception.ValidationException;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Book {

    private Random r = new Random();
    private List<Integer> IDS = new ArrayList<>();
    private List<Person> Authors = new ArrayList<>();
    private int ID;
    private String name;
    private Genre genre;
    private Lang Language;
    private LocalDate publishDate;
    private int borrowCount;
    private boolean isAvaible;
    private Person author;
    private Person borrowPerson;

    public Book() {


    }

    public Book(String name, Genre genre, Lang language, LocalDate publishDate, Person author) {
        setID();
        setName(name);
        setGenre(genre);
        Language = language;
        this.publishDate = publishDate;
        this.borrowCount = borrowCount;
        this.isAvaible = isAvaible;
        Authors.add(author);
    }

    public Book(String name, Genre genre, Lang language, LocalDate publishDate, Person author, Person author2) {
        setID();
        setName(name);
        setGenre(genre);
        Language = language;
        this.publishDate = publishDate;
        this.borrowCount = borrowCount;
        this.isAvaible = isAvaible;
        Authors.add(author);
        Authors.add(author2);
    }

    public void setAuthor(String name, String surname, LocalDate local, Adress adrs) {
        this.author = new Person(name, surname, local, adrs);
        Authors.clear();
        Authors.add(author);

    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {

        if (author.getName()== null || author.getName().isEmpty()) {
            throw new ValidationException("Name cannot be empty");
        }
        this.author = author;
    }

    public List<Person> getAuthors() {
        return Authors;
    }

    public void addAuthor(Person author) {
        if (author.getName()== null || author.getName().isEmpty()) {
            throw new ValidationException("Name cannot be empty");
        }

        Authors.add(author);
    }


    public Person getBorrowPerson() {
        return borrowPerson;
    }


    public void setID() {
        this.ID = r.nextInt();
        while ((IDS.contains(ID))) {
            this.ID = r.nextInt();
        }
        IDS.add(ID);
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        if (genre != Genre.Adventure && genre != Genre.Classic && genre != Genre.Comics && genre != Genre.Detective && genre != Genre.Fantasy) {
            throw new ValidationException("Name cannot be empty");
        }

        this.genre = genre;
    }

    public Lang getLanguage() {
        return Language;
    }

    public void setLanguage(Lang language) {
        Language = language;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public int getBorrowCount() {
        return borrowCount;
    }


    public boolean isAvaible() {
        return isAvaible;
    }


    public Period getAge() {
        return Period.between(publishDate, LocalDate.now());
    }

    public void BorrowBook(Person person) {
        isAvaible = false;
        borrowCount++;
        borrowPerson = person;
        person.BorrwBook(this);


    }

    public void PlaceBack() {
        isAvaible = true;
        borrowPerson.getBorrowsBook().clear();
        borrowPerson = null;
    }


    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", Language=" + Language +
                ", publishDate=" + publishDate +
                ", borrowCount=" + borrowCount +
                ", isAvaible=" + isAvaible +
                ", author=" + author +
                ", borrowPerson=" + borrowPerson +
                '}';
    }
}
