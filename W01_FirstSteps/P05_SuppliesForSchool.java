package W01_FirstSteps;
import java.util.Scanner;
public class P05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pensCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int litersDetergent = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

//          •	Пакет химикали - 5.80 лв.
//          •	Пакет маркери - 7.20 лв.
//          •	Препарат - 1.20 лв (за литър)

        double priceAllPens = pensCount * 5.80;
        double priceAllMarkers = markersCount * 7.20;
        double priceAllDetergent = litersDetergent * 1.20;

        double totalSum = priceAllPens + priceAllMarkers + priceAllDetergent;

        double discount = totalSum * (percentDiscount / 100.0);

        double sumWithDiscount = totalSum - discount;

        System.out.println(sumWithDiscount);
    }
}
