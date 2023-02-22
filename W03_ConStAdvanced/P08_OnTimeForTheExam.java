package W03_ConStAdvanced;

import java.util.Scanner;
public class P08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minOfArrival = Integer.parseInt(scanner.nextLine());

        int examAllMinutes = (examHour * 60) + examMin;
        int arriveAllMinutes = (hourOfArrival * 60) + minOfArrival;

        int diffMin = Math.abs(examAllMinutes - arriveAllMinutes);
        int hour = diffMin / 60;
        int min = diffMin % 60;
        if (examAllMinutes < arriveAllMinutes) {
            System.out.println("Late");
            if (hour >= 1) {
                System.out.printf("%d:%02d hours after the start%n", hour, min);
            } else {
                System.out.printf("%d minutes after the start%n", min);
            }
        } else if (examAllMinutes == arriveAllMinutes || (diffMin >= 0 && diffMin <= 30)) {
            System.out.println("On time");
            if (diffMin > 0) {
                System.out.printf("%d minutes before the start%n", diffMin);
            }
        } else {
            System.out.println("Early");
            if (hour >= 1) {
                System.out.printf("%d:%02d hours before the start%n", hour, min);
            } else {
                System.out.printf("%d minutes before the start%n", min);
            }
        }
    }
}