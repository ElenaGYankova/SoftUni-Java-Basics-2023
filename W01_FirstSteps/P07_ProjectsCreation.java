package W01_FirstSteps;
import java.util.Scanner;
public class P07_ProjectsCreation {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());
        int hours = projectsCount * 3;
        System.out.printf("The architect %s will need %d hours to" +
                " complete %d project/s.",name,hours,projectsCount);
    }
}
