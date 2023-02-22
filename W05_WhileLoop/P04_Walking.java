package W05_WhileLoop;
import java.util.Scanner;
public class P04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String steps = scanner.nextLine();
        int sumSteps = 0;

        while (!steps.equals("Going home")) {
            int currentSteps = Integer.parseInt(steps);
            sumSteps += currentSteps;
            if (sumSteps >= 10000) {
                break;
            }
            steps = scanner.nextLine();
        }
        if (steps.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            sumSteps += stepsToHome;
        }
        if (sumSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - sumSteps);
        }
    }
}
