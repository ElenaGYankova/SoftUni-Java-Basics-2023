package W01_FirstSteps;

import java.util.Scanner;
public class P03_DepositCalculator {

    public static void main(String[] args) {

        /* 1. Прочитаме от конзолата
            - депозирана сума -> double
            - срок на депозита -> int
            - лихвеният процент -> double
          2. Изчисляваме натрупаната лихвата за 1 месец
          3. Изчисляваме лихвата за всички месеци
          4. Пресметнем общата сума -> депозираната сума + натрупаната лихва
          сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
         */

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percentPerYear = Double.parseDouble(scanner.nextLine());
        double amountPerMonth = (deposit * (percentPerYear / 100)) / 12;
        double totalSum = deposit + amountPerMonth * months;

        System.out.println(totalSum);
    }
}