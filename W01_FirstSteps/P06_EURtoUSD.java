package W01_FirstSteps;
import java.util.Scanner;
public class P06_EURtoUSD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.17 USD for 1 EUR
        double euro = Double.parseDouble(scanner.nextLine());
        double usd = euro * 1.17;
        System.out.println("USD = " + usd);
    }
}
