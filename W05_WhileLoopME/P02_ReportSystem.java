package W05_WhileLoopME;
import java.util.Scanner;
public class P02_ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededSum = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int totalSum = 0;

        int numPaysCash = 0;
        int totalPaysCash = 0;

        int numPaysCard = 0;
        int totalPaysCard = 0;

        int numPays = 0;

        while (!command.equals("End")) {
            int currentSum = Integer.parseInt(command);
            numPays++;
            if (numPays % 2 == 0) {
                if (currentSum < 10) {
                    System.out.println("Error in transaction!");

                } else {
                    numPaysCard++;
                    totalPaysCard += currentSum;
                    System.out.println("Product sold!");
                    totalSum += currentSum;
                }
            } else {
                if (currentSum > 100) {
                    System.out.println("Error in transaction!");

                } else {
                    numPaysCash++;
                    totalPaysCash += currentSum;
                    System.out.println("Product sold!");
                    totalSum += currentSum;
                }
            }

            if (totalSum >= neededSum) {
                System.out.printf("Average CS: %.2f%n", 1.0 * totalPaysCash / numPaysCash);
                System.out.printf("Average CC: %.2f", 1.0 * totalPaysCard / numPaysCard);
                break;
            }
            command = scanner.nextLine();
        }

        if (totalSum < neededSum) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
