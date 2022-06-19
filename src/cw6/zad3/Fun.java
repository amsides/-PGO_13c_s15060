package cw6.zad3;

import java.util.ArrayList;
import java.util.Collections;

public interface Fun {


    double f(double x);


    static double minimum(Fun func,double a,double b,double alpha){

        if (a >= b) {
            throw new RuntimeException("A musi być większe od  B.");
        }
        ArrayList<Double> result = new ArrayList<>();
        while (a <= b) {
            result.add(func.f(a));
            a += alpha;
        }
        return Collections.min(result);



    }


}


