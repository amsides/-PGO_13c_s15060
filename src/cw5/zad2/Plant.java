package cw5.zad2;

public class Plant extends Ingredient {

    private int toxity =0;

    public Plant(String name, int baseReagent) {
        super(name, baseReagent);


    }

    public Plant(String name, int baseReagent, int toxity) {
        super(name, baseReagent);
        this.toxity=toxity;

    }

    public int getToxity() {
        return toxity;
    }

    public void setToxity(int toxity) {
        this.toxity = toxity;
    }

    @Override
    protected int getReagent() {
        return super.getReagent()*getToxity();
    }
}
