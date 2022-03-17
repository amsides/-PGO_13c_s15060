package cw1.zd6;

import java.util.Random;

public class zad6 {

    public static void main( String [] args) {

      int [] tmp = new int[10];

        for (int i = 0; i <tmp.length ; i++) {
            tmp[i]=random();
        }

        sortTab(tmp);

        for (int i = 0; i <tmp.length ; i++) {
            System.out.println(tmp[i]);

        }



    }
    public static int random (){

        int min = 100;
        int max = 1000;
        //Generate random int value from 100 to 1000
        int random = (int)Math.floor(Math.random()*(max-min+1)+min);


        return random;
    }

    public static int[] sortTab(int[] arr){

        int temp;

        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        return arr;
    }

}
