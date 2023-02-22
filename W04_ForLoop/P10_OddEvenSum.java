package W04_ForLoop;

import java.util.Scanner;

public class P10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        //i = 1 -> oddSum
        //i = 2 -> evenSum
        //i = 3 -> oddSum
        //i = 4 -> evenSum
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += currentNum;
            } else {
                oddSum += currentNum;
            }
        }

        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d%n", evenSum);
        } else {
            System.out.println("No");
            int diff = Math.abs(evenSum - oddSum);
            System.out.printf("Diff = %d%n", diff);
        }
    }
}