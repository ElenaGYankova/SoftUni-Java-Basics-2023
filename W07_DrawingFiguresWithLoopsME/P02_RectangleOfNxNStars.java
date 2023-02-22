package W07_DrawingFiguresWithLoopsME;
import java.util.Scanner;
public class P02_RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n= Integer.parseInt(scanner.nextLine());
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = 1;
            while (s <= n){
                System.out.print("*");
                s++;
            }
            System.out.println();
        }
    }
}
