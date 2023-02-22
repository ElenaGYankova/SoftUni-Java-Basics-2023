package W05_WhileLoop;
import java.util.Scanner;
public class P02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badCounts = Integer.parseInt(scanner.nextLine());
        String over = scanner.nextLine();
        String lastName = "";
        int bad = 0;
        double countGrade = 0;
        double sumGrade = 0;
        boolean executed = false;
        while (bad < badCounts){
            if (!over.equals("Enough")){
                lastName = over;
            } else {
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            countGrade++;
            sumGrade += grade;
            if (grade <= 4){
                bad++;
            }
            if (bad == badCounts){
                executed = true;
                break;
            }
            over = scanner.nextLine();
        }
        if (!executed){
            System.out.printf("Average score: %.2f%n", sumGrade / countGrade);
            System.out.printf("Number of problems: %.0f%n", countGrade);
            System.out.printf("Last problem: %s", lastName);
        } else {
            System.out.printf("You need a break, %d poor grades.", bad);
        }
    }
}
