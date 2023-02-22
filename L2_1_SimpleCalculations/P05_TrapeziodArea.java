package L2_1_SimpleCalculations;

import java.util.Scanner;

public class P05_TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Формулата за лице на трапец е (b1 + b2) * h / 2.
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double trapeziodArea = (b1 + b2) * (h / 2.0);
        System.out.printf("%.2f", trapeziodArea);
    }
}
