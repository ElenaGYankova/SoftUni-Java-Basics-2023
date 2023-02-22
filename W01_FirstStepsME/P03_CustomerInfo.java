package W01_FirstStepsME;
import java.util.Scanner;
public class P03_CustomerInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //<<fname>> <<lname>> (<<email>>)
        String fname = scanner.nextLine();
        String lname = scanner.nextLine();
        String email = scanner.nextLine();

        System.out.printf("Customer: %s %s (%s)", fname, lname, email);
    }
}
