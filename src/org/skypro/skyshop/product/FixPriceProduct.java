package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIX_PRICE;  // объявлена, но не инициализирована

    static {
        FIX_PRICE = 100;  // инициализация в статическом блоке (число задаётся здесь)
        // Вы можете изменить 100 на любое другое значение.
        // Если требуется совсем без числа — это невозможно для final-поля.
    }

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + ": Фиксированная цена " + FIX_PRICE;
    }
}