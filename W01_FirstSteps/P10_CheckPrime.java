package W01_FirstSteps;
import java.util.Scanner;

public class P10_CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 2;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        }

        while (counter < n) {
            if (n%counter==0) {
                System.out.println("Not Prime");
                isPrime = false;
                break;
            }
            counter++;
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}