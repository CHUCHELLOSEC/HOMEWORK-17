package org.skypro.skyshop;

import org.skypro.skyshop.product.*;
import org.skypro.skyshop.basket.Product;

public class App {
    public static void main(String[] args) {
        // Обычные товары
        org.skypro.skyshop.product.Product apple = new SimpleProduct("Яблоко", 50);
        org.skypro.skyshop.product.Product bread = new SimpleProduct("Хлеб", 30);

        // Товары со скидкой
        org.skypro.skyshop.product.Product cheese = new DiscountedProduct("Сыр", 150, 20);   // 20% скидка -> цена 120
        org.skypro.skyshop.product.Product butter = new DiscountedProduct("Масло", 120, 10); // 10% скидка -> цена 108

        // Товары с фиксированной ценой
        org.skypro.skyshop.product.Product milk = new FixPriceProduct("Молоко");
        org.skypro.skyshop.product.Product cookies = new FixPriceProduct("Печенье");

        // Создаём корзину
        Product basket = new Product();

        // Добавляем продукты
        System.out.println("--- Добавление продуктов ---");
        basket.addProduct(apple);
        basket.addProduct(bread);
        basket.addProduct(cheese);
        basket.addProduct(butter);
        basket.addProduct(milk);
        // Шестой продукт не добавится (корзина на 5)
        basket.addProduct(cookies);

        // Вывод содержимого
        System.out.println("\n--- Содержимое корзины ---");
        basket.printBasket();

        // Общая стоимость
        System.out.println("\nОбщая стоимость (метод getTotalCost): " + basket.getTotalCost());

        // Поиск товаров
        System.out.println("\n--- Поиск ---");
        System.out.println("Поиск 'Молоко': " + basket.containsProduct("Молоко"));
        System.out.println("Поиск 'Колбаса': " + basket.containsProduct("Колбаса"));

        // Очистка корзины
        basket.clearBasket();
        System.out.println("\n--- После очистки ---");
        basket.printBasket();
        System.out.println("Стоимость пустой корзины: " + basket.getTotalCost());
    }
}