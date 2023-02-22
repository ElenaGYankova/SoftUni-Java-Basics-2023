package W03_ConStAdvancedME;
import java.util.Scanner;
public class P01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distance = 0;
        double sum = 0;
        double peopleVip = 0;
        double peopleNormal = 0;
        double calcMoney = 0;

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        if (people >= 1 && people <= 4) {
            distance = budget * 0.75;
        } else if (people >= 5 && people <= 9) {
            distance = budget * 0.60;
        } else if (people > 9 && people <= 24) {
            distance = budget * 0.50;
        } else if (people > 24 && people <= 49) {
            distance = budget * 0.40;
        } else {
            distance = budget * 0.25;
        }
        sum = budget;
        sum -= distance;
        switch (category){
            case "VIP":
                peopleVip = 499.99 * people;
                sum -= peopleVip;
                break;
            case "Normal":
                peopleNormal = 249.99 * people;
                sum -= peopleNormal;
                break;
        }

        if (sum < budget && sum < 0){
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(sum));
        } else {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(sum));
        }
    }
}
