package W06_NestedLoops;
import java.util.Scanner;
public class P04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double allGradesSum = 0;
        int allGradesCount = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String presentationName = input;

            double currentGradesSum = 0;
            for (int i = 0; i < n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                allGradesCount++;

                currentGradesSum = currentGradesSum + currentGrade;
            }

            allGradesSum = allGradesSum + currentGradesSum;

            System.out.printf("%s - %.2f.%n", presentationName, currentGradesSum / n);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.%n", allGradesSum / allGradesCount);
    }
}
