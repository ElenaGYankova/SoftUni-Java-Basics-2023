package W01_FirstSteps;
import java.util.Scanner;
public class P01_USDtoBGN {
    public static void main(String[] args) {

        //1. Пресметнем стойността за български лева -> 1 USD = 1.79549 BGN.

        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());

        double result = usd * 1.79549;

        System.out.println(result);

    }
}
