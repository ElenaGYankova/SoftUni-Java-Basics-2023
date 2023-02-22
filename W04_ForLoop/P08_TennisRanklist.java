package W04_ForLoop;
import java.util.Scanner;
public class P08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        double w = 2000;
        double f = 1200;
        double sf = 720;
        double finalPoints = initialPoints ;
        double ww = 0;

        for (int i = 1; i <= tournaments ; i++) {

            String currentTournament = scanner.nextLine();

            switch (currentTournament){
                case "W":
                    finalPoints += w;
                    ww++;
                    break;
                case "F":
                    finalPoints += f;
                    break;
                case "SF":
                    finalPoints += sf;
                    break;
            }
        }
        double diff = finalPoints - initialPoints;
        double average = diff / tournaments;
        System.out.printf("Final points: %.0f%n", finalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(average));
        System.out.printf("%.2f%%", (ww/tournaments) * 100);
    }
}
