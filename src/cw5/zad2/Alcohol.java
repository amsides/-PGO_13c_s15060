package cw5.zad2;

public class Alcohol extends Liquid{

    private int percent =0;

    public Alcohol(String name, int baseReagent, int dissolubility,int percent) {
        super(name, baseReagent, dissolubility);
        this.percent=percent;
    }




    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        if(percent>=0 && percent <=100){
        this.percent = percent;
        }else
            throw new RuntimeException("percent must by abowe 0 and 100");
    }

    @Override
    protected int getReagent() {
        return super.getReagent()-(getPercent()/100);
    }
}
