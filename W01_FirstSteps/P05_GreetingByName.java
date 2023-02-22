package W01_FirstSteps;
import java.util.Scanner;
public class P05_GreetingByName {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
