package W04_ForLoopME;
import java.util.Scanner;
public class P08_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int maxDiff = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= number; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            int currentNumber2 = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sum2 = currentNumber2 + currentNumber;
            } else {
                sum1 = currentNumber + currentNumber2;
            }
            if (i > 1){
                if (sum1 != sum2) {
                    maxDiff = Math.abs(sum1 - sum2);
                }
            }
        }
        if (maxDiff == 0){
            System.out.printf("Yes, value=%d", sum1);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
