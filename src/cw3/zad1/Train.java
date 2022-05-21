package cw3.zad1;

import java.util.LinkedList;

public class Train {

     private int totalWeight;
     private Car car;

    public Train(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void AddCar(int weight){

        if(car==null) {
            this.car = new Car(weight);
        }
        Car current = car;
        while(current.getNextCar()!=null){

            current=current.getNextCar();
        }
        current.setNextCar(new Car(weight));

    }

    public int GetWeight(){

            totalWeight=car.getNextCar().getWeight();

            return totalWeight;

    }


}
