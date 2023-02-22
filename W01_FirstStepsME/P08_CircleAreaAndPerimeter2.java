package W01_FirstStepsME;
import java.util.Scanner;

public class P08_CircleAreaAndPerimeter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * r * r;

        System.out.printf("Area = %.2f%n", area);

        double parameter = 2 * Math.PI * r;

        System.out.printf("Perimeter = %.2f", parameter);

    }
}
