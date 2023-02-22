package W07_DrawingFiguresWithLoopsME;
import java.util.Scanner;
public class P03_SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = 1;
        for (int i = 1; i <= n; i++) {
            m = 1;
            while (m <= n){
                System.out.print("* ");
                m++;
            }
            System.out.println();
        }
    }
}
