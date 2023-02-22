package W01_FirstSteps;
import java.util.Scanner;
public class P09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double allSqM = Double.parseDouble(scanner.nextLine());
        double amount = allSqM * 7.61;
        double discount = amount * 0.18;
        double result = amount - discount;
        System.out.printf("The final price is: %.2f lv.%n",result);
        System.out.printf("The discount is: %.2f lv.%n",discount);
    }
}
