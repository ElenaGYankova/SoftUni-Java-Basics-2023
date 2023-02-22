package W02_ConditionalStatements;

import java.util.Scanner;

public class P12_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //o За четно число à + 1 т.
        //o За число, което завършва на 5 à + 2 т.

        int points = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;

        if (points <= 100) {
            bonusPoints = 5;
        } else if (points <= 1000) {
            bonusPoints = points * 0.20;
        } else {
            bonusPoints = points * 0.10;
        }

        if (points % 2 == 0) {
            bonusPoints = bonusPoints + 1;
        }

        if (points % 10 == 5) {
            bonusPoints = bonusPoints + 2;
        }

        System.out.println(bonusPoints);
        System.out.println(points + bonusPoints);

    }
}
