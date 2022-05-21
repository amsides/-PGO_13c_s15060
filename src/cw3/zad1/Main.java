package cw3.zad1;

public class Main {


    public static void main(String[] args){


        Train train1= new Train("train1");

        train1.AddCar(10);
        train1.AddCar(20);
        train1.AddCar(30);

        System.out.println(train1.GetWeight());

    }
}
