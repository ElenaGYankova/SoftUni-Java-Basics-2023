package W06_NestedLoopsME;
import java.util.Scanner;
public class P13_PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstCouple = Integer.parseInt(scanner.nextLine());
        int secondCouple = Integer.parseInt(scanner.nextLine());
        int differenceFirst = Integer.parseInt(scanner.nextLine());
        int differenceSecond = Integer.parseInt(scanner.nextLine());

        for (int i = firstCouple; i <= firstCouple + differenceFirst; i++) {
            for (int j = secondCouple; j <= secondCouple + differenceSecond; j++) {
                if (isPrime(i) && isPrime(j)) {
                    System.out.printf("%d%d\n", i, j);
                }
            }
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
