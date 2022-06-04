package cw4.zad2;

public class Main {
    //psvm

    public static void main(String[] args) {

        Figura figura = new Figura("Figura");
        System.out.println(figura.getArea());
        Prostokąt prostokąt =new Prostokąt("Prostokąt",5,5);
        System.out.println(prostokąt.getArea(5,5));
        System.out.println(prostokąt.getPerimeter(5,5));
        System.out.println(prostokąt.getName());


    }
}
