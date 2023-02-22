package W03_ConStAdvanced;

import java.util.Scanner;
public class P01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (type) {
            case "Premiere":
                price = 12;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5;
                break;
        }

        int allSeats = rows * columns;
        double totalPrice = allSeats * price;

        System.out.printf("%.2f leva", totalPrice);
    }
}