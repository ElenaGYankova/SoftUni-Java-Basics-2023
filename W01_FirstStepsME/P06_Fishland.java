package W01_FirstStepsME;
import java.util.Scanner;
public class P06_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceskumria = Double.parseDouble(scanner.nextLine());
        double pricetsatsa = Double.parseDouble(scanner.nextLine());
        double amountpalamud = Double.parseDouble(scanner.nextLine());
        double amountsafrid = Double.parseDouble(scanner.nextLine());
        double amountmidi = Double.parseDouble(scanner.nextLine());
        double pricepalamud = priceskumria + 0.60 * priceskumria;
        double pricesafrid =pricetsatsa + 0.80 * pricetsatsa;
        double sum = (pricepalamud * amountpalamud) + (pricesafrid * amountsafrid) + (amountmidi * 7.50);
        System.out.printf("%.2f", sum);
    }
}
