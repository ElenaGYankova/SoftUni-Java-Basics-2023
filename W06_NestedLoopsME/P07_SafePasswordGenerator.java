package W06_NestedLoopsME;
import java.util.Scanner;
public class P07_SafePasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        char aa = 35;
        char bb = 64;
        boolean stop = false;
        int count = 0;

        for (int i = 1; i <= max; i++) {
            if (stop){
                break;
            }
            for (int j = 1; j <= a; j++) {
                if (stop){
                    break;
                }
                for (int k = 1; k <= b; k++) {
                    System.out.printf("%c%c%d%d%c%c|", aa, bb, j, k, bb, aa);
                    if ( j == a && k == b){
                        stop = true;
                        break;
                    }
                    aa++;
                    bb++;
                    count++;
                    if (aa > 55){
                        aa = 35;
                    }
                    if (bb > 96){
                        bb = 64;
                    }
                    if (count == max){
                        stop = true;
                        break;
                    }
                }
            }
        }
    }
}
