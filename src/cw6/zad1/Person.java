package cw6.zad1;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Person(String name, String surname, LocalDate dateOfBirth) {


        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("imie nie może być puste");
        }else
        this.name = name;
    }

    public void setSurname(String surname) {
        if(surname==null){
            throw new RuntimeException("imie nie może być puste");
        }else
        this.surname = surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {

        if(dateOfBirth==null){
            throw new RuntimeException("imie nie może być puste");
        }else
            this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public abstract double getIncome();

    public int getAgeInYears(){

        return 0;
    }
}



class Employee extends Person{


    public Employee(String name, String surname, LocalDate dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    @Override
    public double getIncome() {
        return 0;
    }
}




class Student extends Person{


    public Student(String name, String surname, LocalDate dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    @Override
    public double getIncome() {
        return 0;
    }
}




