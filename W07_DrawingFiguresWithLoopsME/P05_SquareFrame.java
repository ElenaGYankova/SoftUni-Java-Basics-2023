package W07_DrawingFiguresWithLoopsME;
import java.util.Scanner;
public class P05_SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        String startEnd = "+ ";
        String mid = "| ";
        String midMid = "- ";

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {

                if (i == 1 && k == 1 || i == 1 && k == n || i == n && k == 1 || i ==n && k == n){
                    System.out.print(startEnd);
                } else if (i > 1 && n > i && k == 1 || k == n){
                    System.out.print(mid);
                } else {
                    System.out.print(midMid);
                }
            }
            System.out.println();
        }
    }
}
