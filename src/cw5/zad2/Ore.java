package cw5.zad2;

public class Ore extends Mineral {

    private boolean metallic=true;

    public Ore(String name, int baseReagent, int power, boolean metallic) {
        super(name, baseReagent, power);
        this.metallic=metallic;
    }

    public boolean isMetallic() {
        return metallic;
    }

    public void setMetallic(boolean metallic) {
        this.metallic = metallic;
    }

    @Override
    protected int getReagent() {
        if(isMetallic()==false){
            return super.getReagent()/2;
        }else
        return super.getReagent();
    }
}
