package W02_ConditionalStatements;
import java.util.Scanner;
public class P17_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        int sumVideoCards = videoCard * 250;

        double cpuPrice = 0.35 * sumVideoCards;
        double sumCpu = cpu * cpuPrice;

        double ramPrice = 0.10 * sumVideoCards;
        double sumRam = ram * ramPrice;
//•	Ако бюджета е достатъчен:
//"You have {остатъчен бюджет} leva left!"
//•	Ако сумата надхвърля бюджета:
//"Not enough money! You need {нужна сума} leva more!"
        double totalPrice = sumVideoCards + sumCpu + sumRam;

        if (videoCard > cpu) {
            totalPrice = totalPrice - 0.15 * totalPrice;
        }
        if (budget >= totalPrice) {
            double leftMoney = budget - totalPrice;
            System.out.printf("You have %.2f leva left!", leftMoney);
        } else {
            double neededMoney = totalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", neededMoney);
        }

    }
}
