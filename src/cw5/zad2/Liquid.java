package cw5.zad2;

public class Liquid extends Ingredient {

    protected int dissolubility=0;

    public Liquid(String name, int baseReagent ) {
        super(name, baseReagent);

    }

    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        setDissolubility(dissolubility);
    }

    public int getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        if(dissolubility<0 && dissolubility>100){
            throw new RuntimeException("dissolubity musi byc miedzy 0 a 100");
        }else
        this.dissolubility = dissolubility;

    }

    @Override
    protected int getReagent() {
        return (super.getReagent()*getDissolubility())/100;
    }
}
