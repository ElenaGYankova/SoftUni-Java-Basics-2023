package W03_ConStAdvanced;

import java.util.Scanner;
public class P11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean workingDay = dayOfWeek.equals("Monday") ||
                dayOfWeek.equals("Tuesday") ||
                dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") ||
                dayOfWeek.equals("Friday");
        boolean weekend = dayOfWeek.equals("Saturday") ||
                dayOfWeek.equals("Sunday");

        boolean flag = true;

        double priceKG = 0;
        if (workingDay) {
            if ("banana".equals(fruit)) {
                priceKG = 2.50;
            } else if ("apple".equals(fruit)) {
                priceKG = 1.20;
            } else if ("orange".equals(fruit)) {
                priceKG = 0.85;
            } else if ("grapefruit".equals(fruit)) {
                priceKG = 1.45;
            } else if ("kiwi".equals(fruit)) {
                priceKG = 2.70;
            } else if ("pineapple".equals(fruit)) {
                priceKG = 5.50;
            } else if ("grapes".equals(fruit)) {
                priceKG = 3.85;
            } else {
                flag = false;
            }
        } else if (weekend) {
            if ("banana".equals(fruit)) {
                priceKG = 2.70;
            } else if ("apple".equals(fruit)) {
                priceKG = 1.25;
            } else if ("orange".equals(fruit)) {
                priceKG = 0.90;
            } else if ("grapefruit".equals(fruit)) {
                priceKG = 1.60;
            } else if ("kiwi".equals(fruit)) {
                priceKG = 3;
            } else if ("pineapple".equals(fruit)) {
                priceKG = 5.60;
            } else if ("grapes".equals(fruit)) {
                priceKG = 4.20;
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        if (flag) {
            double totalPrice = quantity * priceKG;
            System.out.printf("%.2f", totalPrice);

        } else {
            System.out.println("error");
        }
    }
}