package cw1.zd2;

import java.util.Scanner;

public class zad2 {

    public static void main( String [] args) {


        Scanner s1 = new Scanner(System.in);

        int a = s1.nextInt(), b = s1.nextInt(), c = s1.nextInt();

        System.out.println(a +" "+ b +"  "+ c);

        if (a > b  && a>c) {

            int tmp=0;
            c = a;
            a = tmp;


        }



    }
}
