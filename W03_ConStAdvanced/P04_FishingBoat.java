package W03_ConStAdvanced;
import java.util.Scanner;
public class P04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (people <= 6) {
            price = price * 0.90;
        } else if (people <= 11) {
            price = price * 0.85;
        } else {
            price = price * 0.75;
        }

        if (people % 2 == 0 && !season.equals("Autumn")) {
            price = price * 0.95;
        }

        double diff = Math.abs(budget - price);
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
