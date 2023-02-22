package W04_ForLoopME;
import java.util.Scanner;
public class P05_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = Integer.parseInt(scanner.nextLine());
        double oneTo9 = 0;
        double tenTo19 = 0;
        double twentyTo29 = 0;
        double thirtyTo39 = 0;
        double fortyTo49 = 0;
        double invalid = 0;
        double result = 0;

        for (int i = 1; i <= amount ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0){
                invalid++;
                result = result / 2;
            } else if (number < 10){
                oneTo9++;
                result = result + (number * 0.20);
            } else if (number < 20){
                tenTo19++;
                result = result + (number * 0.30);
            } else if (number < 30){
                twentyTo29++;
                result = result + (number * 0.40);
            } else if (number < 40){
                thirtyTo39++;
                result += 50;
            } else if ( number <= 50){
                fortyTo49++;
                result += 100;
            } else {
                invalid++;
                result = result / 2;
            }
        }

        double calc1to10 = (oneTo9 / amount) * 100;
        double calc10to20 = (tenTo19 / amount) * 100;
        double calc20to30 = (twentyTo29 / amount) * 100;
        double calc30to40 = (thirtyTo39 / amount) * 100;
        double calc40to50 = (fortyTo49 / amount) * 100;
        double calcInvalid = (invalid / amount) * 100;

        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", calc1to10);
        System.out.printf("From 10 to 19: %.2f%%\n", calc10to20);
        System.out.printf("From 20 to 29: %.2f%%\n", calc20to30);
        System.out.printf("From 30 to 39: %.2f%%\n", calc30to40);
        System.out.printf("From 40 to 50: %.2f%%\n", calc40to50);
        System.out.printf("Invalid numbers: %.2f%%", calcInvalid);
    }
}
