package W01_FirstStepsME;
import java.util.Scanner;
public class P02_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double c = a * h / 2;
        // формулата за лице на триъгълник: area = a * h / 2
        System.out.printf("%.2f", c);
    }
}
