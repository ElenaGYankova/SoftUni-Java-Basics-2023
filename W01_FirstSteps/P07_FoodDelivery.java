package W01_FirstSteps;

import java.util.Scanner;
public class P07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //• Пилешко меню – 10.35 лв.
        //• Меню с риба – 12.40 лв.
        //• Вегетарианско меню – 8.15 лв.
        double chicken = Double.parseDouble(scanner.nextLine());
        double fish = Double.parseDouble(scanner.nextLine());
        double vegan = Double.parseDouble(scanner.nextLine());
        double sumChicken = chicken * 10.35;
        double sumFish = fish * 12.40;
        double sumVegan = vegan * 8.15;
        double sumMenu = sumChicken + sumFish + sumVegan;
        double sumDessert = sumMenu * 0.2;
        double finalSum = sumMenu + sumDessert + 2.50;
        System.out.println(finalSum);

        //Цена за пилешките менюта: 2 броя * 10.35 = 20.70 Цена за менютата с риба:
        // 4 броя * 12.40 = 49.60 Цена за вегетарианските менюта: 3 броя * 8.15 = 24.45
        // Обща цена на менютата: 20.70 + 49.60 + 24.45 = 94.75 Цена на десерта: 20% от 94.75 = 18.95
        // Цена на доставка: 2.50 (по условие) Обща цена на поръчката: 94.75 + 18.95 + 2.50 = 116.20
    }
}
