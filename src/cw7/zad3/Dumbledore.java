package cw7.zad3;

public class Dumbledore extends Character {
    public Dumbledore(String name, Location location) {
        super(name, location);
        Character.addToList(this);
        setPowerLevel(10000);
    }


}
