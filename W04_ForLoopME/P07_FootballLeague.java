package W04_ForLoopME;
import java.util.Scanner;
public class P07_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        double a = 0;
        double b = 0;
        double v = 0;
        double g = 0;

        for (int i = 1; i <= fans ; i++) {
            String sector = scanner.nextLine();

            if (sector.equals("A")){
                a++;
            } else if (sector.equals("B")){
                b++;
            } else if (sector.equals("V")){
                v++;
            } else {
                g++;
            }

        }
        double sumA = (a / fans) * 100;
        double sumB = (b / fans) * 100;
        double sumV = (v / fans) * 100;
        double sumG = (g / fans) * 100;
        double sumFans = (1.0 * fans / capacity) * 100;

        System.out.printf("%.2f%%\n", sumA);
        System.out.printf("%.2f%%\n", sumB);
        System.out.printf("%.2f%%\n", sumV);
        System.out.printf("%.2f%%\n", sumG);
        System.out.printf("%.2f%%\n", sumFans);
    }
}
