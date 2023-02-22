package W04_ForLoopME;
import java.util.Scanner;
public class P09_Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = 0;
        int minutes = 0;

        while (hours < 24) {
            System.out.printf("%d : %d%n", hours, minutes);
            if (minutes < 60) {
                minutes += 1;
                if (minutes == 60){
                    minutes = 0;
                    hours += 1;
                }
            }
        }
    }
}
