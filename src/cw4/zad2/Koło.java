package cw4.zad2;

public class Koło extends Figura {


    private String name;
    private int promien;

    public Koło(String name, int promien) {
       super ( name=name);
        this.promien = promien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPromien() {
        return promien;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }
}
