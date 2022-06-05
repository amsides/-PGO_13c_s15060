package cw5.zad2;

public class Main {

    public static void main(String[] args){
        Elixir elixir = new Elixir("Elixir młodości");
        elixir.setCatalyst(new Water("Woda", 100, 10, true));
        elixir.addIngredient(new Plant("kiwat lotosu",100,2));
        elixir.addIngredient(new Crystal("diament", 100, 100, 1000));
        Crystal crystal=new Crystal("crystal", 10, 10, 100);
        elixir.addIngredient(crystal);
        elixir.addIngredient(new Alcohol("Tequila", 100, 50, 10));

        System.out.println("Składniki w naszym elixirze ");
        elixir.getIngredients();



        System.out.println("--------------------------------------------------------------------------");


        elixir.removeIngredient(crystal);
        System.out.println("Składniki w naszym elixirze ");
        elixir.getIngredients();


        System.out.println("---------------------------------------------------------------------------");
        elixir.Create();
        elixir.print();



    }
}
