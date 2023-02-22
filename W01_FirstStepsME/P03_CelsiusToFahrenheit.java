package W01_FirstStepsME;
import java.util.Scanner;
public class P03_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //multiply by 1.8 (or 9/5) and add 32;
        double degreesCelsius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = (degreesCelsius * 1.8) + 32;
        System.out.printf("%.2f", fahrenheit);
    }
}
