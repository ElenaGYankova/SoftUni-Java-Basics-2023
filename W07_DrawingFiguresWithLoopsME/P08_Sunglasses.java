package W07_DrawingFiguresWithLoopsME;
import java.util.Scanner;
public class P08_Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString("*", n*2) +
                repeatString(" ", n) +
                repeatString("*", n*2));

        for (int row = 1; row <= n - 2; row++) {
            System.out.print("*" + repeatString("/", (n*2)-2) + "*");
            if (row == (n-1)/2) {
                System.out.print(repeatString("|", n));
            } else {
                System.out.print(repeatString(" ", n));
            }
            System.out.println("*" + repeatString("/", (n*2)-2) + "*");
        }

        System.out.println(repeatString("*", n*2) +
                repeatString(" ", n) +
                repeatString("*", n*2));
    }
    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <=count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
