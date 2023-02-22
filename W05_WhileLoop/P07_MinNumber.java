package W05_WhileLoop;
import java.util.Scanner;
public class P07_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int min = Integer.MAX_VALUE;

        while (!text.equals("Stop")){
            int number = Integer.parseInt(text);
            if (number < min){
                min = number;
            }
            text = scanner.nextLine();
        }
        System.out.printf("%d", min);
    }
}
