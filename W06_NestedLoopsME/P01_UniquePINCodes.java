package W06_NestedLoopsME;
import java.util.Scanner;
public class P01_UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        boolean simple = true;
        int count = 1;

        for (int i = 2; i <= first; i++) {
            for (int j = 2; j <= second; j++) {
                simple = true;
                if (j > 1) {
                    count = 1;
                    for (int k = 2; k <= second; k++) {
                        if (j % k == 0) {
                            count++;
                            if (count == 3) {
                                simple = false;
                                break;
                            }
                        }
                    }
                }
                for (int k = 1; k <= third; k++) {

                    if (i % 2 == 0 && k % 2 == 0 && simple && count == 2) {
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }

            }

        }
    }
}
