package W05_WhileLoop;
import java.util.Scanner;
public class P08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int loss = 0;
        double sum = 0;
        double yearSum = 0;

        for (int i = 1; i <= 12; i++) {
            double score = Double.parseDouble(scanner.nextLine());
            if (score < 4) {
                loss++;
                if (loss == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, i - 1);
                    break;
                }
            }
            yearSum += score;
            sum += score;
            if (i == 12) {
                System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
            }
        }
    }
}
