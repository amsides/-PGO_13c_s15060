package cw4.zad2;

public class Figura {
    private String name;

    public Figura(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea(){

        return 0;
    }



    public double getArea(int a){

        return (double) ((3.14)*a*a);
    }

    public int getPerimeter(){

        return 0;
    }
    public int getPerimeter(int a , int b ){

        return (a+b)*2;
    }

    public double getPerimeter(int a ){

        return 2*(3.14)*a;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "name='" + name + '\'' +
                '}';
    }
}
