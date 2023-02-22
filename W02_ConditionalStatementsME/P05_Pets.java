package W02_ConditionalStatementsME;
import java.util.Scanner;
public class P05_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysMissing = Integer.parseInt(scanner.nextLine());
        int leavedMeat = Integer.parseInt(scanner.nextLine());
        double dogKilos = Double.parseDouble(scanner.nextLine());
        double catKilos = Double.parseDouble(scanner.nextLine());
        double turtleGrams = Double.parseDouble(scanner.nextLine());

        double dogEat = daysMissing * dogKilos;
        double catEat = daysMissing * catKilos;
        double turtleEat = (daysMissing * turtleGrams) / 1000;
        double sumEat = dogEat + catEat + turtleEat;

        if (sumEat <= leavedMeat){
            System.out.printf("%.0f kilos of food left.", Math.floor(leavedMeat - sumEat));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(sumEat - leavedMeat));
        }
    }
}
