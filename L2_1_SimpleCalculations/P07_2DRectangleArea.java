package L2_1_SimpleCalculations;
import java.util.Scanner;
public class P07_2DRectangleArea {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double a = Math.max(x1, x2) - Math.min(x1, x2);
        double b = Math.max(y2, y1) - Math.min(y1, y2);

        double area = a * b;
        double perimeter = 2 * (a + b);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
