package W07_DrawingFiguresWithLoopsME;
import java.util.Scanner;
public class P04_TriangleOFDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = 1;
        String dollar = "$";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(dollar + " ");
            }
            m++;
            System.out.println();
        }
    }
}
