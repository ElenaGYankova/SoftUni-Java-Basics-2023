package L2_1_SimpleCalculations;
import java.util.Scanner;
public class P01_SquareFrames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("+ " + repeatString("- ", n-2) + "+");

        for (int row = 1; row <= n - 2; row++) {
            System.out.println("| " + repeatString("- ", n - 2) + "|");
        }
        System.out.println("+ " + repeatString("- ", n-2) + "+");
    }
    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <=count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
