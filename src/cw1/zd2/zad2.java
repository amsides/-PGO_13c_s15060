package cw1.zd2;

import java.util.Scanner;

public class zad2 {

    public static void main( String [] args) {




        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(),
                b = scanner.nextInt(),
                c = scanner.nextInt();

        System.out.println(a  + " " + b + " " + c);

        if(a > b && a > c)
        {
            int tmp = c;
            c = a;
            a = tmp;
        }
        if(b > a && b > c)
        {
            int tmp = c;
            c = b;
            b = tmp;
        }
        if(a > b)
        {
            int tmp = b;
            b = a;
            a = tmp;
        }
        System.out.println(a  + " " + b + " " + c);



    }
}
