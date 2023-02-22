package W01_FirstSteps;
import java.util.Scanner;
public class P_EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordOne = scanner.nextLine();
        String wordTwo = scanner.nextLine();

        if (wordOne.equalsIgnoreCase(wordTwo)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
