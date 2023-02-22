package W04_ForLoopME;
import java.util.Scanner;
public class P04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        double topStudents = 0;
        double b4and499 = 0;
        double b3and399 = 0;
        double fail = 0;
        double average = 0;
        double sum = 0;

        for (int i = 1; i <= students ; i++) {

            double grade = Double.parseDouble(scanner.nextLine());
            sum += grade;

            if (grade < 3){
                fail++;
            } else if (grade < 4){
                b3and399++;
            } else if (grade < 5){
                b4and499++;
            } else {
                topStudents++;
            }
        }
        average = sum / students;
        topStudents = (topStudents / students) * 100;
        b4and499 = (b4and499 / students) * 100;
        b3and399 = (b3and399 / students) * 100;
        fail = (fail / students) * 100;

        System.out.printf("Top students: %.2f%%\n", topStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", b4and499);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", b3and399);
        System.out.printf("Fail: %.2f%%\n", fail);
        System.out.printf("Average: %.2f", average);
    }
}
