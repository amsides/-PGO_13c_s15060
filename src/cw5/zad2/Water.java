package cw5.zad2;

public class Water extends Liquid{

    protected boolean distilated = false;

    public Water(String name, int baseReagent, int dissolubility , boolean distilated) {
        super(name, baseReagent, dissolubility);
        this.distilated=distilated;
    }


    public boolean GetDistilated() {
        return distilated;
    }


    public void setDistilated(boolean distilated) {
        if (distilated== Boolean.parseBoolean(null)){
            throw new RuntimeException("nie może być puste");
        }else
        this.distilated = distilated;
    }



    @Override
    public String toString() {
        return "Water{" +
                "distilated=" + distilated +
                ", name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                '}';
    }
}
