package org.skypro.skyshop.basket;

public class Product {
    private static final int MAX_SIZE = 5;
    private final org.skypro.skyshop.product.Product[] products = new org.skypro.skyshop.product.Product[MAX_SIZE];

    public void addProduct(org.skypro.skyshop.product.Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }

    public int getTotalCost() {
        int total = 0;
        for (org.skypro.skyshop.product.Product p : products) {
            if (p != null) {
                total += p.getPrice();
            }
        }
        return total;
    }

    public void printBasket() {
        boolean empty = true;
        int specialCount = 0;

        for (org.skypro.skyshop.product.Product p : products) {
            if (p != null) {
                System.out.println(p.toString()); // используем переопределённый toString
                if (p.isSpecial()) {
                    specialCount++;
                }
                empty = false;
            }
        }

        if (empty) {
            System.out.println("в корзине пусто");
        } else {
            System.out.println("Итого: " + getTotalCost());
            System.out.println("Специальных товаров: " + specialCount);
        }
    }

    public boolean containsProduct(String name) {
        for (org.skypro.skyshop.product.Product p : products) {
            if (p != null && p.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
    }
}
