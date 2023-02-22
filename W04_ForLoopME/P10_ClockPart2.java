package W04_ForLoopME;
public class P10_ClockPart2 {
    public static void main(String[] args) {

        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        while (hours <= 24) {
            if (hours == 24) {
                break;
            }
            while (minutes <= 60) {
                if (minutes == 60) {
                    hours++;
                    minutes = 0;
                    break;
                }
                while (seconds <= 60) {
                    System.out.printf("%d : %d : %d%n", hours, minutes, seconds);
                    seconds++;
                    if (seconds == 60) {
                        minutes++;
                        seconds = 0;
                        break;
                    }
                }
            }
        }
    }
}
