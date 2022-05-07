package cw3.zad2;

import cw2.exception.ValidationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

    private String Name;
    private String Surname;
    private Double MoneyInCash;
    private Double MoneyOnCard;
    private Shoppingcard shoppingcard;
    private List<Shoppingcard> HistoryOftransaction = new ArrayList();


    public Person(String name, String surname, Double moneyInCash, Double moneyOnCard) {
        setName(name);
        setSurname(surname);
        setMoneyInCash(moneyInCash);
        setMoneyOnCard(moneyOnCard);

    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public Double getMoneyInCash() {
        return MoneyInCash;
    }

    public Double getMoneyOnCard() {
        return MoneyOnCard;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new ValidationException("Name cannot be empty");
        }
        Name = name;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new ValidationException("Name cannot be empty");
        }
        Surname = surname;
    }

    public void setMoneyInCash(Double moneyInCash) {

        if (moneyInCash == null || moneyInCash < 0) {
            throw new ValidationException("cannot be empty or <0");
        }
        MoneyInCash = moneyInCash;
    }

    public void setMoneyOnCard(Double moneyOnCard) {

        if (moneyOnCard == null || moneyOnCard < 0) {
            throw new ValidationException("cannot be empty or <0");
        }
        MoneyOnCard = moneyOnCard;
    }

    public void MakeOrder() {

        if (shoppingcard != null) {
            throw new ValidationException("Clear shoppingcart befour you crate new ");
        }
        shoppingcard = new Shoppingcard();

    }

    public Shoppingcard getShoppingcard() {
        return shoppingcard;
    }

    public List<Shoppingcard> getHistoryOftransaction() {
        return HistoryOftransaction;
    }


    public void BuyInCash() {
        if (getMoneyInCash() < shoppingcard.getTotalPrice()) {
            throw new ValidationException(" Zbyt mało środków ");
        }

        setMoneyInCash(getMoneyInCash() - shoppingcard.getTotalPrice());
        shoppingcard.sell();
        getHistoryOftransaction().add(shoppingcard);
        shoppingcard = null;

    }

//    public void BuyInCash() {
//        if (getMoneyInCash() < shoppingcard.getTotalPrice()) {
//            throw new ValidationException(" Zbyt mało środków ");
//        }
//        double tmp=shoppingcard.getTotalPrice();
//        double tmp2=getMoneyInCash();
//        System.out.println(tmp+"Total");
//        System.out.println(tmp2+"MoneyInCash");
//        setMoneyInCash(tmp2-tmp);
//        System.out.println(getMoneyInCash());
//    }

    public void BuyByCard() {
        if (getMoneyOnCard() < shoppingcard.getTotalPrice()) {
            throw new ValidationException(" Zbyt mało środków ");
        }

        setMoneyOnCard(getMoneyOnCard()-shoppingcard.getTotalPrice());
        shoppingcard.sell();
        getHistoryOftransaction().add(shoppingcard);
        shoppingcard = null;

    }






        @Override
        public String toString () {
            return "Person{" +
                    "Name='" + Name + '\'' +
                    ", Surname='" + Surname + '\'' +
                    ", MoneyInCash=" + MoneyInCash +
                    ", MoneyOnCard=" + MoneyOnCard +
                    ", shoppingcard=" + shoppingcard +
                    ", HistoryOftransaction=" + HistoryOftransaction +
                    '}';
        }
    }

