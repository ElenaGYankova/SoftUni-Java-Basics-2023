package W02_ConditionalStatementsME;

import java.util.Scanner;

public class P02_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDaysOff = Integer.parseInt(scanner.nextLine());

        double daysOffGame = countDaysOff*127;
        double daysWorkGame = (365-countDaysOff)*63;
        double gameTime = daysOffGame+daysWorkGame;

        int need = 0;
        int left = 0;
        int hours = 0;
        int minutes = 0;

        if (gameTime<=30000) {
            left=30000-(int) gameTime;
            hours=left/60;
            minutes=left%60;
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play", hours, minutes);
        } else {
            need=(int)gameTime-30000;
            hours=need/60;
            minutes=need%60;
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play", hours, minutes);
        }
    }
}