package cw5.zad2;

public class Flower extends Plant {
    public Flower(String name, int baseReagent) {
        super(name, baseReagent);
    }

    public Flower(String name, int baseReagent, int toxity) {
        super(name, baseReagent, toxity);
    }

    @Override
    protected int getReagent() {
        return super.getReagent()*2;
    }
}
