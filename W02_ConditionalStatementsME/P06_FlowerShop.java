package W02_ConditionalStatementsME;
import java.util.Scanner;
public class P06_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mangolii = 3.25;
        double zumbuli = 4;
        double roses = 3.50;
        double cactus = 8;

        int quantityMangoli = Integer.parseInt(scanner.nextLine());
        int quantityZumbuli = Integer.parseInt(scanner.nextLine());
        int quantityRoses = Integer.parseInt(scanner.nextLine());
        int quantityCactus = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        double sumMangoli = quantityMangoli * mangolii;
        double sumZumbuli = quantityZumbuli * zumbuli;
        double sumRoses = quantityRoses * roses;
        double sumCactus = quantityCactus * cactus;
        double sumSell = sumMangoli + sumZumbuli + sumRoses + sumCactus;
        double taxes = sumSell * 0.05;
        double sumAll = sumSell - taxes;

        if (sumAll >= priceGift){
            System.out.printf("She is left with %.0f leva.", Math.floor(sumAll - priceGift));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(priceGift - sumAll));
        }
    }
}
