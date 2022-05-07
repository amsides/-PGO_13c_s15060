package cw3.zad2;

public class Main {

    public static void main(String[] args) {

        Storage electronic = new Storage(1);

        Products p1 = new Products("TV",ProductType.Electronic,500.00,3);
        Products p2 = new Products("TV",ProductType.Electronic,5.00,4,electronic);


        Person customer1= new Person ("Adam","Nowak" ,100.00,100.00);

        customer1.MakeOrder();
        customer1.getShoppingcard().addProduct(p2);;


        customer1.BuyInCash();
        System.out.println(customer1.getMoneyInCash());
        System.out.println(p2.getQuantity());








    }
}
