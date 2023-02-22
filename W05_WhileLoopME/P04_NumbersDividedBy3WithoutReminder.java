package W05_WhileLoopME;
import java.util.Scanner;
public class P04_NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        while (number <= 100){
            if (number % 3 == 0){
                System.out.printf("%d\n", number);
            }
            number++;
        }
    }
}
