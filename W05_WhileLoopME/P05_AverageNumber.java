package W05_WhileLoopME;
import java.util.Scanner;
public class P05_AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            sum += number;
            if (i == n){
                sum = sum / n;
                System.out.printf("%.2f", sum);
            }
        }
    }
}
