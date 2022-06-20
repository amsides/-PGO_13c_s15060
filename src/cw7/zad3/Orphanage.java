package cw7.zad3;

import java.util.ArrayList;
import java.util.List;

public class Orphanage extends Character {

  private  List<Character> lista = new ArrayList<Character>();

    public Orphanage(String name, Location location) {
     super(name, location);
    }


    public void addChild(Character c){
        lista.add(c);
        c.setLocation(this.getLocation());
    }
}
