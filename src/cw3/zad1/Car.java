package cw3.zad1;

public class Car {

   private int weight;
    private Car nextCar;

    public Car getNextCar() {
        return nextCar;
    }

    public void setNextCar(Car nextCar) {
        this.nextCar = nextCar;
    }

    public Car(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
