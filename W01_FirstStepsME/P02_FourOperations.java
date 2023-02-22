package W01_FirstStepsME;
import java.util.Scanner;
public class P02_FourOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double sum1 = num1 + num2;
        double sum2 = num1 - num2;
        double sum3 = num1 * num2;
        double sum4 = num1 + num2;

    }
}
