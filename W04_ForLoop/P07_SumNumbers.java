package W04_ForLoop;
import java.util.Scanner;
public class P07_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int currentSum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentSum;
        }
        System.out.println(sum);
    }
}
