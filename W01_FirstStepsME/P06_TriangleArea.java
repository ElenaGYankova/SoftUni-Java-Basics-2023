package W01_FirstStepsME;

import java.util.Scanner;

public class P06_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = calculateArea(width, height);
        System.out.printf("%.2f", area);
    }

    public static double calculateArea(double width, double height) {
        return (width * height) / 2;
    }
}
