package W06_NestedLoopsME;
import java.util.Scanner;
public class P14_PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int count1 = 0;
        int count2 = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                count1 = 0;
                for (char k = 'a'; k <= 'z'; k++) {
                    if (count1 == l){
                        break;
                    }
                    count1++;
                    count2 = 0;
                    for (char m = 'a'; m <= 'z'; m++) {
                        if (count2 == l){
                            break;
                        }
                        count2++;
                        for (int o = 1; o <= n; o++) {
                            if (o <= i || o <= j){
                                continue;
                            } else {
                                System.out.printf("%d%d%c%c%d ", i, j, k, m, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
