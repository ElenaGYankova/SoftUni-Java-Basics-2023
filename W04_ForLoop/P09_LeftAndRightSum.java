package W04_ForLoop;
import java.util.Scanner;
public class P09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + currentNum;
        }
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + currentNum;
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d%n", leftSum);
        } else {
            int diff = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d%n", diff);
        }
    }
}
