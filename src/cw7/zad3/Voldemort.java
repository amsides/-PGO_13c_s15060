package cw7.zad3;


import java.util.ArrayList;
import java.util.List;

public class Voldemort extends Character implements Spells{

    private List<String> horcruxs = new ArrayList<String>();
   // private List<Character> targets = new ArrayList<Character>();

    public Voldemort(String name, Location location) {
        super(name, location);
        Character.addToList(this);
        setPowerLevel(8000);
    }

    public Voldemort(Riddle r) {
        super(r.getName(), r.getLocation());
        Character.addToList(this);
        setPowerLevel(8000);
    }


    public void createHorcruxes(int i) {
        for (int j = 1; j <= i; j++) {
            horcruxs.add("        horcrux " + (horcruxs.size()+1));
        }
    }


    public void printHorcruxes() {
        int i=0;
        System.out.println("Created horcruxes:");
        for (String s:horcruxs) {
            System.out.println(horcruxs.get(i));
            i++;

        }

    }


    public void target (Character c){
        targets.add(c);

    }
    @Override
    public void castSpell(Spell s){
        if (s == Spell.AvadaKedavra) {
    for (int i = 0; i < targets.size(); i++) {
        if (targets.get(i).getName().equals("Harry")) {
            System.out.println(targets.get(i).getName() + " goes LOL...");
            Avadcadabra(this);
            System.out.println(this.getName() + " died.");

        } else {

            Avadcadabra(targets.get(i));
            System.out.println(targets.get(i).getName() + " died.");
        }
    }
}
        }





    @Override
    public void Avadcadabra(Character c) {
        c.setLive(0);
    }
}

