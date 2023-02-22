package W01_FirstStepsME;
import java.util.Scanner;
public class P06_USDtoEUR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //0.88 EUR for 1 USD
        double usd = Double.parseDouble(scanner.nextLine());
        double eur = usd * 0.88;
        System.out.printf("%.2f", eur);

    }
}
