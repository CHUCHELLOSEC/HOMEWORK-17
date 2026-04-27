package org.skypro.skyshop.product;
public class Product {
    private final String name;
    private int price = 0;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        String name1 = "";
        this.name = name1;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isSpecial() {
        return false; // обычный товар – не специальный
    }

    @Override
    public String toString() {
        return name + ": " + price + " руб.";
    }
}