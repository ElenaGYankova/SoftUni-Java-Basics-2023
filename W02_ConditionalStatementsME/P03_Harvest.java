package W02_ConditionalStatementsME;

import java.util.Scanner;
public class P03_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vineyard = Integer.parseInt(scanner.nextLine());
        double grape = Double.parseDouble(scanner.nextLine());
        int necessaryWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double totalGrape = vineyard * grape;
        double wine = totalGrape * 40 / 100.0 / 2.5;
        double litersLeft = Math.abs (wine - necessaryWine);
        double litersPerPerson = litersLeft / workers;

        if (wine < necessaryWine) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(litersLeft));
        } else if (wine >= necessaryWine) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(wine));
            System.out.printf("%s liters left -> %s liters per person.",(int) Math.ceil(litersLeft) ,(int) Math.ceil(litersPerPerson));
        }
    }
}
