package W01_FirstStepsME;
import java.util.Scanner;
public class P09_WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weather = scanner.nextLine();


        switch (weather) {
            case "sunny":
                System.out.println("It's warm outside!");
        break;
            default:
                System.out.println("It's cold outside!");
        }
    }
}
