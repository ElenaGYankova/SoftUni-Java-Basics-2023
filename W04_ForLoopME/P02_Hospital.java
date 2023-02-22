package W04_ForLoopME;
import java.util.Scanner;
public class P02_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int watched = 0;
        int unWatched = 0;
        int doctors = 7;

        for (int i = 1; i <= period; i++) {
            if (i % 3 == 0) {
                if (watched < unWatched) {
                    doctors++;
                }
            }

            int patients = Integer.parseInt(scanner.nextLine());

            if (patients > doctors) {
                unWatched += patients - doctors;
            }
            if (patients < doctors) {
                watched += patients;
            } else {
                watched += doctors;
            }
        }
        System.out.printf("Treated patients: %d.%n", watched);
        System.out.printf("Untreated patients: %d.", unWatched);
    }
}
