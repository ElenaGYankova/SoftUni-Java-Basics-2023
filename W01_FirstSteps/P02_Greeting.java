package W01_FirstSteps;
import java.util.Scanner;
public class P02_Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello %s", name );
    }
}
