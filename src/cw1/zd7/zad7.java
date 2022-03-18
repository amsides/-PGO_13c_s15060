package cw1.zd7;

import java.util.Scanner;

public class zad7 {

    public static void main(String[] args) {
        program();

    }

    public static void program() {
        Scanner s = new Scanner(System.in);

        System.out.print("Wprowadź liczbę większą niż 5  oraz liczbę nie parzystą :");
        int n = s.nextInt();

        if (n < 5 || n % 2 == 0) {
            System.out.println("Błedna liczba !!!");
            System.out.println("Wprowadź poprawną lczbę");

            program();
        } else {

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n; j++)
                {
                    if (i == 1 || i == n || j==1 || j==n ||j==i) {
                        System.out.print("x");
                    }
                    else
                    {
                        System.out.print(" ");
                    }




                    }
                System.out.println();

                }


            }


        }
    }

