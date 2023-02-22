package W01_FirstStepsME;
import java.util.Scanner;
public class P05_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"Town {name} has population of {population}
        //and area {area} square km."
        String name = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",
                name, population, area);
    }
}
