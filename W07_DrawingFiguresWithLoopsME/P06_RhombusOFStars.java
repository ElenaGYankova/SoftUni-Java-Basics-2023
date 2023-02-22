package W07_DrawingFiguresWithLoopsME;
import java.util.Scanner;
public class P06_RhombusOFStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String star = "*";
        String space = " ";

        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                System.out.println();
            }
            if (i != n) {
                for (int j = i; j < n; j++) {
                    System.out.print(space);
                }
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%s ", star);
            }
        }
        System.out.println();
        for (int i = n; i > 1; i--) {
            if (i != 1) {
                for (int j = i; j < n; j++) {
                    System.out.print(space);
                }
            }
            for (int j = i; j > 1; j--) {
                System.out.print(space + star);
            }
            System.out.println();
        }
    }
}
