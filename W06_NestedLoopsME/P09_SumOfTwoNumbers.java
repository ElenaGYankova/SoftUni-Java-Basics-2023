package W06_NestedLoopsME;
import java.util.Scanner;
public class P09_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean founded = true;
        boolean stop = false;

        for (int i = start; i <= end; i++) {
            if (stop){
                break;
            }
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magic){
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magic);
                    founded = false;
                    stop = true;
                    break;
                }
            }
        }
        if (founded){
            System.out.printf("%d combinations - neither equals %d", count, magic);
        }
    }
}
