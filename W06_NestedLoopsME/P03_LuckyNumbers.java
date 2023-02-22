package W06_NestedLoopsME;
import java.util.Scanner;
public class P03_LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1000; i <= 9999; i++) {

            int num1 = i / 1000 % 10;
            int num2 = i / 100 % 10;
            int num3 = i / 10 % 10;
            int num4 = i % 10;
            if (num2 == 0 || num3 == 0 || num4 == 0){
                continue;
            }
            if (num1 + num2 == num3 + num4 && n % (num1 + num2) == 0){

                System.out.printf("%d ", i);
            }
        }
    }
}
