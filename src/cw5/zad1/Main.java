package cw5.zad1;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

            List<Figura> figuraList = new ArrayList<>();
            figuraList.add(new Figura("figura1"));
            figuraList.add(new Prostokąt("prostokat1", 2, 3));

            figuraList.add(new Koło("name",6.0));

            for (Figura f : figuraList) {
                System.out.println(f.getName() + ": odwod = " + f.getPerimeter() + " powierzchnia = " + f.getArea());
            }
        }
    }


