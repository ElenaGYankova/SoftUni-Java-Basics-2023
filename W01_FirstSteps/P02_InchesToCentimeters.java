package W01_FirstSteps;
import java.util.Scanner;
public class P02_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inches = ");
        double inch = Double.parseDouble(scanner.nextLine());
        double cm = inch * 2.54;
        System.out.print("Centimeters = " + cm);
    }
}
