package W02_ConditionalStatementsME;
import java.util.Scanner;
public class P01_PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int full = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double timeMissing = Double.parseDouble(scanner.nextLine());

        double p1PerMissingTime = p1 * timeMissing;
        double p2PerMissingTime = p2 * timeMissing;
        double sumMissing = p1PerMissingTime + p2PerMissingTime;
        double p1Percent = p1 * timeMissing / sumMissing * 100;
        double p2Percent = p2 * timeMissing / sumMissing * 100;
        double totalPercent = sumMissing / full * 100;

        if (sumMissing <= full){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalPercent,p1Percent, p2Percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", timeMissing, Math.abs(sumMissing - full));
        }
    }
}
