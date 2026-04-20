package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private static final int MAX_SIZE = 5;
    private final Product[] products = new Product[MAX_SIZE];

    // Добавление продукта в первую свободную ячейку
    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }

    // Общая стоимость всех продуктов в корзине
    public int getTotalCost() {
        int total = 0;
        for (Product p : products) {
            if (p != null) {
                total += p.price();
            }
        }
        return total;
    }

    // Печать содержимого корзины
    public void printBasket() {
        boolean empty = true;
        for (Product p : products) {
            if (p != null) {
                System.out.println(p.name() + ": " + p.price());
                empty = false;
            }
        }
        if (empty) {
            System.out.println("в корзине пусто");
        } else {
            System.out.println("Итого: " + getTotalCost());
        }
    }

    // Проверка наличия продукта по имени
    public boolean containsProduct(String name) {
        for (Product p : products) {
            if (p != null && p.name().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // Очистка корзины (обнуление всех элементов)
    public void clearBasket() {
        Arrays.fill(products, null);
    }
}