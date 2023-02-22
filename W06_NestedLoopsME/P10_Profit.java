package W06_NestedLoopsME;
import java.util.Scanner;
public class P10_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneDollar = Integer.parseInt(scanner.nextLine());
        int twoDollars = Integer.parseInt(scanner.nextLine());
        int treeDollars = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= oneDollar; i++) {
            for (int j = 0; j <= twoDollars; j++) {
                for (int k = 0; k <= treeDollars; k++) {
                    if ((i * 1) + (j * 2) + (k * 5) == sum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
