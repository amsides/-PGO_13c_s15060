package cw7.zad3;

public class Potter extends Child {

    public Potter(String name, Location location) {
        super(name, location);
        Character.addToList(this);
        if (this.getName().equals("Harry")) {
            setPowerLevel(8500);
        }
        if (this.getName().equals("Lily") ){
            setPowerLevel(7000);
            System.out.println();
        }
        if (this.getName().equals("James")) {
            setPowerLevel(7500);
        }
    }
}
