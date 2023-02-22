package W05_WhileLoop;
import java.util.Scanner;
public class P09_Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double grade = 1;
        double badGrades = 0;;
        double sum = 0;
        boolean excluded = false;

        while (grade <= 12){

            if (badGrades == 2){
                excluded = true;
                break;
            }
            double currentScore = Double.parseDouble(scanner.nextLine());
            if (currentScore < 4){
                badGrades++;
                continue;
            }
            grade +=1;
            sum += currentScore;
        }
        if (excluded){
            System.out.printf("%s has been excluded at %.0f grade", name, grade);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f",name, sum / 12);
        }
    }
}
