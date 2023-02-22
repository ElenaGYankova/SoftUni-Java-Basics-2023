package W06_NestedLoopsME;
import java.util.Scanner;
public class P11_HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double tax = 0;
        double sum = 0;

        for (int i = 1; i <= days; i++) {
            tax = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && !(j % 2 == 0)){
                    tax += 2.50;
                } else if (!(i % 2 == 0) && j % 2 == 0){
                    tax += 1.25;
                } else {
                    tax++;
                }
                if (j == hours){
                    System.out.printf("Day: %d - %.2f leva\n", i, tax);
                    sum += tax;
                }
            }
        }
        System.out.printf("Total: %.2f leva", sum);
    }
}
