package cw3.zad2;

import cw2.exception.ValidationException;

public class Storage {

    private int deliveryTime = 1;


    public Storage(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {

        if (deliveryTime<0) {
            throw new ValidationException("nie moze byc mniejszy od 0 ");
        }
        this.deliveryTime = deliveryTime;

    }

    @Override
    public String toString() {
        return "Storage{" +
                "deliveryTime=" + deliveryTime +
                '}';
    }
}
