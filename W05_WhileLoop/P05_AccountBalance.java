package W05_WhileLoop;
import java.util.Scanner;
public class P05_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String moneyy = scanner.nextLine();
        double allMoney = 0;

        while (!moneyy.equals("NoMoreMoney")) {
            double myMoney = Double.parseDouble(moneyy);
            if (myMoney < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            allMoney += myMoney;
            System.out.printf("Increase: %.2f%n", myMoney);
            moneyy = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", allMoney);
    }
}
