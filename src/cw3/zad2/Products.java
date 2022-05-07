package cw3.zad2;

import cw2.exception.ValidationException;
import cw2.zad5.Genre;

import java.util.ArrayList;
import java.util.List;

public class Products {

    private String name;
    private ProductType productType;
    private Double price;
    private int quantity;
    private boolean isAvailable;
    private Storage storage;


    public Products(String name, ProductType productType, Double price, int quantity) {
        setName(name);
        setProductType(productType);
        setPrice(price);
        setQuantity(quantity);

    }

    public Products(String name, ProductType productType, Double price, int quantity ,Storage storage) {
        setName(name);
        setProductType(productType);
        setPrice(price);
        setQuantity(quantity);
        setStorage(storage);

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new ValidationException("Name cannot be empty");
        }
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {

        if (productType != ProductType.Consumable && productType!= ProductType.Electronic && productType != ProductType.Entertainment ) {
            throw new ValidationException(" cannot by another type");
        }

        this.productType = productType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price)
    {
        if (price == null || price <0) {
            throw new ValidationException(" cannot be empty or <0");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }





    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new ValidationException("niemoże być mniejsze od 0");
        }
        if(quantity>0){
        isAvailable=true;
        }else
            isAvailable=false;

        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void sell() {
        setQuantity(quantity-1);
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", productType=" + productType +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isAvailable=" + isAvailable +
                ", storage=" + storage +

                '}';
    }

    public void IncreaseQuantity (int wartosc){
        setQuantity(quantity+wartosc);



    }



}