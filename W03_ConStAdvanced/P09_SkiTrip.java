package W03_ConStAdvanced;

import java.util.Scanner;
public class P09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String evaluation = scanner.nextLine();

        double price = 0.0;
        double moneyForTrip = 0;

        switch (roomType) {
            case "room for one person":
                if (days < 10) {
                    price = 18;
                } else if (days <= 15) {
                    price = 18;
                } else {
                    price = 18;
                }
                break;
            case "apartment":
                if (days < 10) {
                    price = 25 * 0.7;
                } else if (days <= 15) {
                    price = 25 * 0.65;
                } else {
                    price = 25 * 0.5;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    price = 35 * 0.9;
                } else if (days <= 15) {
                    price = 35 * 0.85;
                } else {
                    price = 35 * 0.8;
                }
                break;
        }
        moneyForTrip = (days - 1) * price;
        if ("positive".equals(evaluation)) {
            moneyForTrip = moneyForTrip * 1.25;
        } else {
            moneyForTrip = moneyForTrip * 0.9;
        }
        System.out.printf("%.2f", moneyForTrip);
    }
}