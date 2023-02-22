package L2_1_SimpleCalculations;

import java.text.DecimalFormat;
import java.util.Scanner;
public class P06_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.########");

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = calculateArea(width, height);
        System.out.printf("%s", df.format(area));
    }

    public static double calculateArea(double width, double height) {
        return (width * height) / 2;
    }
}
