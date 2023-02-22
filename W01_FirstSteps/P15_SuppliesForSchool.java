package W01_FirstSteps;

import java.util.Scanner;
public class P15_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int chemical = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double sum = (pens * 5.80) + (markers * 7.20) + (chemical * 1.20);
        double endSum = sum - (sum * discount / 100);

        System.out.println(endSum);
    }
}
