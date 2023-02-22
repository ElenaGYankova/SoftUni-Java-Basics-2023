package W04_ForLoop;
import java.util.Scanner;
public class P02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sumOther = 0;

        for (int i = 1; i <= number; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            sumOther += n;
            if (n > maxNumber) {
                maxNumber = n;
            }
        }
        if (sumOther - maxNumber == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        } else {
            double sum = sumOther - maxNumber;

            System.out.println("No");
            System.out.printf("Diff = %.0f", Math.abs(maxNumber - sum));
        }
    }
}
