package W05_WhileLoop;
import java.util.Scanner;
public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int spendingCount = 0;
        int countDays = 0;

        while (availableMoney < neededMoney && spendingCount < 5) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            countDays++;
            if (action.equals("spend")) {
                availableMoney -= money;
                spendingCount++;
            } else if (action.equals("save")) {
                availableMoney += money;
                spendingCount = 0;
            }
            if (availableMoney < 0) {
                availableMoney = 0;
            }
        }
        if (availableMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", countDays);
        }
        if (spendingCount == 5){
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        }
    }
}
