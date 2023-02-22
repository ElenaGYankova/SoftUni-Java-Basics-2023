package W01_FirstSteps;
import java.util.Scanner;
public class P_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int stars = 1;
        for (int i = 1; i < n; i++) {
            System.out.println(repeatString(" ", n - i) + repeatString("* ", stars));
            stars++;
        }

        for (int j = 1; j <= n; j++) {
            System.out.println(repeatString(" ", j - 1) + repeatString("* ", stars));
            stars--;
        }
    }
    static String repeatString(String toRepeat, int count) {
        String text = "";

        for (int i = 1; i <=count; i++) {
            text = text + toRepeat;
        }
        return  text;
    }
}
