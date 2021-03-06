package cw7.zad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class Character implements Comparable<Character> {

    private String name;
    private Location location;
    private int Live=100;
    private int powerLevel;



    private static List<Character> lista = new ArrayList<Character>();
    protected List<Character> targets = new ArrayList<Character>();

    public Character(String name, Location location) {
     setName(name);
     setLocation(location);
     //lista.add(this);
    }



   public void  introduce(){

       System.out.println("Hello, I am"+" "+name);
   }

    public void moveTo(Character c){
        setLocation(c.location);
    }

    public void  moveTo(Location l){
        this.setLocation(l);
    }

    public static void  MoveAllTo(Location l,Character c, Character c2){
        c.setLocation(l);
        c2.setLocation(l);
    }

    public void say(String s, Character c){
        System.out.println(getName() +" to "+c.name);
        System.out.println("    "+s);

    }


    public  void doSth(String s){
        System.out.println("I'm "+this.getName()+", I'm "+s);

        }

     public static void doSth(String s, Character c1,Character c2, Character c3){
         System.out.println("I'm "+c1.getName()+", I'm "+s);
         System.out.println("I'm "+c2.getName()+", I'm "+s);
         System.out.println("I'm "+c3.getName()+", I'm "+s);

     }



   public static void status(){
       System.out.println("====Status====");
        Collections.sort(lista);
       for (Character c:lista )
             {
                 System.out.println(c.getName()+" : "+c.getLive() );

       }
       System.out.println("==============");
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new RuntimeException("Imię nie może być puste");
        } else {
            this.name = name;
        }
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        if(location==null){
            throw new RuntimeException("Nie może być puste");
        }
        this.location = location;
    }

    public int getLive() {
        return Live;
    }

    public void setLive(int live) {
        if(live<0 || live >100){
            throw new RuntimeException("Punkty życia myszą być pomiędzy 0 a 100");
        }
        Live = live;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        if(powerLevel<0){
            throw new RuntimeException("Moc postaci nie może być mniejsza od 0");
        }
        this.powerLevel = powerLevel;
    }

    public static void addToList(Character a){
        lista.add(a);

    }
    public void castSpell(Spell s){}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character)) return false;
        Character character = (Character) o;
        return Live == character.Live &&
                powerLevel == character.powerLevel &&
                name.equals(character.name) &&
                location == character.location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Character c) {
        return Integer.compare(this.getPowerLevel(), c.getPowerLevel());
    }
}
