package W02_ConditionalStatementsME;
import java.util.Scanner;
public class P07_FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (type.equals("Diesel")) {
            if (quantity >= 25) {
                System.out.println("You have enough diesel.");
            } else {
                System.out.println("Fill your tank with diesel!");
            }
        } else if (type.equals("Gasoline")) {
            if (quantity >= 25) {
                System.out.println("You have enough gasoline.");
            } else {
                System.out.println("Fill your tank with gasoline!");
            }
        } else if (type.equals("Gas")) {
            if (quantity >= 25) {
                System.out.println("You have enough gas.");
            } else {
                System.out.println("Fill your tank with gas!");
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
