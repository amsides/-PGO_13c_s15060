package cw7.zad3;

public class Child extends Character{

    public Child(String name, Location location) {
        super(name, location);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Location getLocation() {
        return super.getLocation();
    }

    @Override
    public void setLocation(Location location) {
        super.setLocation(location);
    }
}
