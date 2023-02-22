package W06_NestedLoopsME;
import java.util.Scanner;
public class P05_ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int man = Integer.parseInt(scanner.nextLine());
        int woman = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());
        boolean stop = false;
        int count = 0;

        for (int i = 1; i <= maxTables; i++) {
            if (stop){
                break;
            }
            for (int j = 1; j <= man; j++) {
                if (stop){
                    break;
                }
                for (int k = 1; k <= woman; k++) {
                    System.out.printf("(%d <-> %d) ", j, k);
                    count++;
                    if (j == man && k == woman || count == maxTables){
                        stop = true;
                        break;
                    }
                }
            }
        }
    }
}
