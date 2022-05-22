package cw5.zad1;

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


    @Override
    public String toString() {
        return "Koło{" +
                "name='" + name + '\'' +
                ", promien=" + promien +
                '}';
    }
}
