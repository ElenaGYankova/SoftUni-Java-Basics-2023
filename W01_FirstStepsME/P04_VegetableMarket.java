package W01_FirstStepsME;
import java.util.Scanner;
public class P04_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която да пресмята приходите от реколтата в евро
        //( ако приемем, че едно евро е равно на 1.94лв).

        double vegetables = Double.parseDouble(scanner.nextLine());
        double fruits = Double.parseDouble(scanner.nextLine());
        int totalVeg = Integer.parseInt(scanner.nextLine());
        int totalFr = Integer.parseInt(scanner.nextLine());

        double vegPrice = vegetables * totalVeg;
        double frPrice = fruits * totalFr;
        double total = vegPrice + frPrice;

        System.out.printf("%.2f", total / 1.94);
    }
}