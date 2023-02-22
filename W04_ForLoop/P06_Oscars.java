package W04_ForLoop;
import java.util.Scanner;
public class P06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judge = Integer.parseInt(scanner.nextLine());
        double allPoints = academyPoints;

        for (int i = 1; i <= judge; i++) {

            String nameJudge = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            allPoints += (nameJudge.length() * points) / 2;

            if (allPoints >= 1250.5){
                System.out.printf("%nCongratulations, %s got a nominee for leading role with %.1f!", name, allPoints);
                break;
            }
        }
        if (allPoints < 1250.5){
            double diff = 1250.5 - allPoints;
            System.out.printf("Sorry, %s you need %.1f more!", name, diff);
        }
    }
}
