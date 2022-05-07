package cw3.zad2;

import cw2.exception.ValidationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shoppingcard {

    private Random r = new Random();
    private int ID;
    private List<Integer> IDS = new ArrayList<>();
    private List<Products>ListOfProducts = new ArrayList<>();
    private int totalPrice;
    private int totalDeliveryTime;


    public List<Integer> getIDS() {
        return IDS;
    }





    public void setID() {
        this.ID = r.nextInt();
        while ((IDS.contains(ID))) {
            this.ID = r.nextInt();
        }
        IDS.add(ID);
    }
    public void addProduct(Products product){
        if(product.getQuantity() <= 0){
            throw new RuntimeException("Nie można doac produktu ,brak w magazynie");
        }
        ListOfProducts.add(product);
    }


    public int getTotalPrice() {
        totalPrice=0;
        if (ListOfProducts.size()<1) {
            throw new ValidationException("Pusta lista");
        }
        for (Products product:ListOfProducts)
        {
            if(product.isAvailable()==true){
                totalPrice+=product.getPrice();

            }else{
                System.out.println(product +" Jest niedostepny ");
                ListOfProducts.remove(product);

            }

        }
        return totalPrice;
    }

//    public int getTotalPrice() {
//        totalPrice=0;
//        if (ListOfProducts.size()<1) {
//            throw new ValidationException("Pusta lista");
//        }
//        for (Products product:ListOfProducts)
//        {
//
//                totalPrice+=product.getPrice();
//            System.out.println(totalPrice);
//
//
//
//        }
//        return totalPrice;
//    }


    public void sell(){

        if (ListOfProducts.size()<1) {
            throw new ValidationException("Pusta lista");
        }
        for (Products product:ListOfProducts)
        {
            if(product.isAvailable()==true){
                product.sell();

            }else{
                System.out.println(product +" Jest niedostepny ");
                ListOfProducts.remove(product);

            }

        }


    }
    public int getTotalDeliveryTime() {
        int tmp=0;
        for (Products product:ListOfProducts) {
           {
               if(product.getStorage()==null){
                   return 0;
               }
               else{
                 tmp= product.getStorage().getDeliveryTime();
               }


           }
        }
        totalDeliveryTime=tmp;
        return totalDeliveryTime;
    }
}
