package cw5.zad2;

public class Root extends Plant {
    public Root(String name, int baseReagent) {
        super(name, baseReagent);
    }

    public Root(String name, int baseReagent, int toxity) {
        super(name, baseReagent, toxity);
    }

    @Override
    protected int getReagent() {
        return super.getReagent()/2;
    }
}
