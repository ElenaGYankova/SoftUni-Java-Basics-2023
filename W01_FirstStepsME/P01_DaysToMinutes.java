package W01_FirstStepsME;
import java.util.Scanner;
public class P01_DaysToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        //1 day = 24 hours * 60 minutes
        int daysToMinutes = days * 24 * 60 ;
        System.out.printf("Minutes = %d", daysToMinutes);
    }
}
