package org.skypro.skyshop;

import org.skypro.skyshop.product.*;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product apple = new SimpleProduct("Яблоко", 50);
        Product bread = new SimpleProduct("Хлеб", 30);
        Product cheese = new DiscountedProduct("Сыр", 150, 20);
        Product butter = new DiscountedProduct("Масло", 120, 10);
        Product milk = new FixPriceProduct("Молоко");
        Product cookies = new FixPriceProduct("Печенье");

        ProductBasket basket = new ProductBasket();

        System.out.println("--- Добавление продуктов ---");
        basket.addProduct(apple);
        basket.addProduct(bread);
        basket.addProduct(cheese);
        basket.addProduct(butter);
        basket.addProduct(milk);
        basket.addProduct(cookies);

        System.out.println("\n--- Содержимое корзины ---");
        basket.printBasket();

        System.out.println("\nОбщая стоимость: " + basket.getTotalCost());

        System.out.println("\n--- Поиск ---");
        System.out.println("Поиск 'Молоко': " + basket.containsProduct("Молоко"));
        System.out.println("Поиск 'Колбаса': " + basket.containsProduct("Колбаса"));

        basket.clearBasket();
        System.out.println("\n--- После очистки ---");
        basket.printBasket();
    }
}