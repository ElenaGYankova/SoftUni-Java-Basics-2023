package W03_ConStAdvancedME;
import java.util.Scanner;
public class P02_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int junior = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        double juniorTax = 0;
        double seniorsTax = 0;
        double sumTaxes = 0;
        int sumPeople = junior + seniors;
        double discount = 0;
        double taxes = 0;

        switch (type){
            case "trail":
                juniorTax = junior * 5.50;
                seniorsTax = seniors * 7;
                sumTaxes = juniorTax + seniorsTax;
                break;
            case "cross-country":
                juniorTax = junior * 8;
                seniorsTax = seniors * 9.50;
                sumTaxes = juniorTax + seniorsTax;
                if (sumPeople >= 50){
                    discount = sumTaxes * 0.25;
                    sumTaxes -= discount;
                }
                break;
            case "downhill":
                juniorTax = junior * 12.25;
                seniorsTax = seniors * 13.75;
                sumTaxes = juniorTax + seniorsTax;
                break;
            case "road":
                juniorTax = junior * 20;
                seniorsTax = seniors * 21.50;
                sumTaxes = juniorTax + seniorsTax;
                break;
        }
        taxes = sumTaxes * 0.05;
        double total = sumTaxes - taxes;
        System.out.printf("%.2f", total);
    }
}
