package cw5.zad2;

import java.util.ArrayList;
import java.util.List;

public class Elixir {

    private String name ;

    private boolean isCreated=false;

    private int power=0;

    private Liquid catalyst;

    private List<Ingredient> ingredients=new ArrayList<>();

    public Elixir(String name) {
        setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            throw new RuntimeException("nazwa nie moze byc pusta");
        }else
        this.name = name;
    }

    public boolean isCreated() {
        return isCreated;
    }

    public int getPower() {
        if(isCreated==true){

            return power;
        }else
            throw new RuntimeException("Aby otzymać power musisz stworzyć elixir");
    }

    public void setCatalyst(Liquid catalyst) {
        if(isCreated==false){
        this.catalyst = catalyst;
        }else
            throw new RuntimeException("elixir został już stworzony nie mozna zmienić");
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void addIngredient(Ingredient i){
        if (isCreated==false){
            ingredients.add(i);
        }else
            throw new RuntimeException("Nie można dać ,elixir został już sworzony");

    }

   public void removeIngredient(Ingredient i){
       if (isCreated==false){
           ingredients.remove(i);
       }else
           throw new RuntimeException("Nie można usunuąć, elixir został już sworzony");

   }

    public void Create(){

        power=0;
        if(catalyst==null){
            throw new RuntimeException("Nie można stworzyć elixiru");
        }else {
            isCreated=true;
            for (Ingredient ingredient : ingredients) {
                power += ingredient.getReagent();

            }
            power=power/catalyst.getReagent();
        }

    }

    public void  getIngredients() {
        int i=1;
        for(Ingredient ingredient : ingredients){
            System.out.println(i+". "+ingredient.getName() );
            i++;
        }
        System.out.println("Ilość składkików :"+i);
    }

    @Override
    public String toString() {
        return "Elixir{" +
                "name='" + name + '\'' +
                ", isCreated=" + isCreated +
                ", power=" + power +
                ", catalyst=" + catalyst +
                ", ingredients=" + ingredients +
                '}';
    }

    public void print (){
        System.out.println("Status stowrzenia :"+ isCreated);
        System.out.println("Nazwa elixiru :"+getName());
        System.out.println("Siła elixiru :"+getPower());
        System.out.println("Katalizator :"+ catalyst.getName());
        System.out.println("lista składników");
        getIngredients();

    }
}
