package cw5.zad2;

public class Crystal extends Mineral {

    private int  magicPower=0;

    public Crystal(String name, int baseReagent, int magicPower) {
        super(name, baseReagent);
        this.magicPower=magicPower;

    }

    public Crystal(String name, int baseReagent, int power, int magicPower) {
        super(name, baseReagent, power);
        this.magicPower = magicPower;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    @Override
    protected int getReagent() {
        return super.getReagent()+getMagicPower();
    }
}
