package cw5.zad1;

import cw3.zad2.Shoppingcard;
import cw4.zad2.Figura;
import cw4.zad2.Prostokąt;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        Figura figura = new Figura("Figura");
        System.out.println(figura.getArea());
        Prostokąt prostokąt =new Prostokąt("Prostokąt",5,5);
        Koło koło=new Koło("koło", 5);
        System.out.println(prostokąt.getArea(5,5));
        System.out.println(prostokąt.getPerimeter(5,5));
        System.out.println(prostokąt.getName());

        List<Figura > Listoffigurs = new ArrayList();

            Listoffigurs.add(figura);
            Listoffigurs.add(prostokąt);

        for (Figura f:Listoffigurs) {
            System.out.println("b");
            System.out.println(f.getName() +" "+ f.getArea()+" "+f.getPerimeter());

        }
    }
}
