package W04_ForLoop;
import java.util.Scanner;
public class P04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingPrice = Double.parseDouble(scanner.nextLine());
        int singleToyPrice = Integer.parseInt(scanner.nextLine());
        double mooney = 0;
        int brother = 0;
        int toys = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0){
                mooney = mooney + ( 5 * i );
                brother++;
            } else {
                toys++;
            }
        }
        singleToyPrice = toys * singleToyPrice;
        double sum = mooney + singleToyPrice - brother;

        if (sum >= washingPrice){
            System.out.printf("Yes! %.2f", Math.abs(sum - washingPrice));
        } else {
            System.out.printf("No! %.2f", Math.abs(sum - washingPrice));
        }
    }
}
