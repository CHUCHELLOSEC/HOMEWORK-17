package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    static void main() {
        // Создаём несколько продуктов
        Product apple = new Product("Яблоко", 50);
        Product bread = new Product("Хлеб", 30);
        Product milk = new Product("Молоко", 80);
        Product cheese = new Product("Сыр", 150);
        Product butter = new Product("Масло", 120);
        Product extra = new Product("Печенье", 45);

        // Создаём корзину
        ProductBasket basket = new ProductBasket();

        // 1. Добавляем продукты (заполняем корзину до предела)
        System.out.println("--- Добавление продуктов ---");
        basket.addProduct(apple);
        basket.addProduct(bread);
        basket.addProduct(milk);
        basket.addProduct(cheese);
        basket.addProduct(butter);
        // Попытка добавить шестой продукт (корзина рассчитана на 5)
        basket.addProduct(extra);

        // 2. Печать содержимого и стоимости
        System.out.println("\n--- Содержимое корзины ---");
        basket.printBasket();
        System.out.println("Общая стоимость: " + basket.getTotalCost());

        // 3. Поиск товаров
        System.out.println("\n--- Поиск товаров ---");
        System.out.println("Поиск 'Молоко': " + basket.containsProduct("Молоко"));
        System.out.println("Поиск 'Колбаса': " + basket.containsProduct("Колбаса"));

        // 4. Очистка корзины
        System.out.println("\n--- Очистка корзины ---");
        basket.clearBasket();

        // 5. Печать пустой корзины и её стоимость
        System.out.println("\n--- Пустая корзина ---");
        basket.printBasket();
        System.out.println("Общая стоимость: " + basket.getTotalCost());
        System.out.println("Поиск 'Яблоко' после очистки: " + basket.containsProduct("Яблоко"));
    }
}