package vending;

public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();

        // Добавляем напитки
        vendingMachine.addDrink(new HotDrinkWithTemperature("Кофе", 250, 70));
        vendingMachine.addDrink(new HotDrinkWithTemperature("Чай", 300, 80));
        vendingMachine.addDrink(new HotDrinkWithTemperature("Какао", 200, 60));

        // Получаем напитки
        HotDrink drink1 = vendingMachine.getProduct("Кофе", 250, 70);
        HotDrink drink2 = vendingMachine.getProduct("Чай", 300, 80);
        HotDrink drink3 = vendingMachine.getProduct("Какао", 200, 60);
        HotDrink drink4 = vendingMachine.getProduct("Эспрессо", 150, 90); // Не найден

        // Вывод результатов
        System.out.println(drink1);
        System.out.println(drink2);
        System.out.println(drink3);
        System.out.println(drink4 != null ? drink4 : "Напиток не найден!");
    }
}
