package W04_ForLoop;

import java.util.Scanner;
public class P05_Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTap = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        double lostMoney = 0.0;

        for (int i = 1; i <= countTap; i++) {
            String nameSite = scanner.nextLine();

            switch (nameSite) {
                case "Facebook":
                    lostMoney = lostMoney + 150;
                    break;
                case "Instagram":
                    lostMoney = lostMoney + 100;
                    break;
                case "Reddit":
                    lostMoney = lostMoney + 50;
                    break;
            }
            if (salary <= lostMoney) {
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if (salary > lostMoney) {
            double leftMoney = salary - lostMoney;
            System.out.printf("%.0f", leftMoney);
        }
    }
}