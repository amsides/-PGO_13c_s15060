package cw4.zad2;

public class Prostokąt extends Figura {


    private int bokA ;
    private int bokB;

    public Prostokąt(String name, int bokA, int bokB) {

       super (name);
        this.bokA = bokA;
        this.bokB = bokB;
    }





    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }




    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public int getArea(int a, int b){

        return a*b;
    }
}
