package W04_ForLoop;
import java.util.Scanner;
public class P03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber < 200){
                p1++;
            } else if (currentNumber < 400){
                p2++;
            } else if (currentNumber < 600){
                p3++;
            } else if (currentNumber <= 799){
                p4++;
            } else {
                p5++;
            }
        }

        double p1Percent = 1.0 * p1/n * 100;
        double p2Percent = 1.0 * p2/n * 100;
        double p3Percent = 1.0 * p3/n * 100;
        double p4Percent = 1.0 * p4/n * 100;
        double p5Percent = 1.0 * p5/n * 100;

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
        System.out.printf("%.2f%%%n", p4Percent);
        System.out.printf("%.2f%%%n", p5Percent);
    }
}
