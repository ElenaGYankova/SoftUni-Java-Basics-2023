package W03_ConStAdvanced;
import java.util.Scanner;
public class P07_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        String type = "";
        if (hour >= 10 && hour <= 18) {
            if (dayOfWeek.equals("Monday") ||
                    dayOfWeek.equals("Tuesday") ||
                    dayOfWeek.equals("Wednesday") ||
                    dayOfWeek.equals("Thursday") ||
                    dayOfWeek.equals("Friday") ||
                    dayOfWeek.equals("Saturday")) {
                type = "open";
            } else {
                type = "closed";
            }

        } else {
        type = "closed";
    }
        System.out.println(type);
    }
}
