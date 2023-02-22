package W06_NestedLoopsME;
import java.util.Scanner;

public class P02_LettersCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String tree = scanner.nextLine();
        char on1 = one.charAt(0);
        char on2 = two.charAt(0);
        char on3 = tree.charAt(0);
        int count = 0;

        for (char i = on1; i <= on2; i++) {
            for (char j = on1; j <= on2; j++) {
                for (char k = on1; k <= on2; k++) {
                    if (!(k == on3) && !(j == on3) && !(i == on3)){
                        System.out.printf("%c%c%c ", i,j,k);
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
