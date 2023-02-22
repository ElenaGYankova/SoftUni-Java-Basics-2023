package W05_WhileLoopME;
import java.util.Scanner;
public class P01_Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;
        int dishes = 0;
        double platesPrice = 5;
        double potPrice = 15;
        int pot = 0;
        int plates = 0;
        double quantity = Double.parseDouble(input) * 750;
        boolean end = false;

        while (!input.equals("End")) {

            count++;
            if (count > 1) {
                dishes = Integer.parseInt(input);
            } else {
                dishes = Integer.parseInt(scanner.nextLine());
            }
            if (count % 3 == 0) {
                pot += dishes;
                quantity -= dishes * potPrice;
            } else {
                plates += dishes;
                quantity -= dishes * platesPrice;
            }
            if (quantity < 0) {
                end = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (end) {
            quantity = Math.abs(quantity);
            System.out.printf("Not enough detergent, %.0f ml. more necessary!", quantity);
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", plates, pot);
            System.out.printf("Leftover detergent %d ml.", (int) quantity);
        }
    }
}
