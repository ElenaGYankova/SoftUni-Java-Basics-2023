package W01_FirstStepsME;
import java.util.Scanner;
public class P04_PersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //first name, last name, country and town
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String country = scanner.nextLine();
        String town = scanner.nextLine();

        System.out.printf("%s %s from %s - %s!", firstName, lastName, country,town);
    }
}
