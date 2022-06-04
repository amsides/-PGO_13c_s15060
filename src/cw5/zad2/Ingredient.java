package cw5.zad2;

public abstract class Ingredient {

    protected String name ;
    protected int  baseReagent;

    public Ingredient(String name, int baseReagent) {
        this.name = name;
        this.baseReagent = baseReagent;
    }

    protected   int getReagent(){

        return baseReagent;
    }

    public String getName() {
        return name;
    }

    public int getBaseReagent() {
        return baseReagent;
    }

    public void setName(String name) {
        if(name==null){

            throw new RuntimeException("Imie nie może być puste");
        }else
            this.name = name;
    }

    public void setBaseReagent(int baseReagent) {
        if( baseReagent>=0){
            this.baseReagent = baseReagent;
        }else
            throw new  RuntimeException("baseReagent nie może być pusty");

    }
}
