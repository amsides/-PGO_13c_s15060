package cw5.zad2;

public class Mineral extends Ingredient {
    private int power=0;

    public Mineral(String name, int baseReagent , int power) {
        super(name, baseReagent);
        this.power=power;
    }

    public Mineral(String name, int baseReagent ) {
        super(name, baseReagent);

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    protected int getReagent() {
        return super.getReagent()+getPower();
    }

    @Override
    public String toString() {
        return "Mineral{" +
                "power=" + power +
                ", name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                '}';
    }
}
