package W06_NestedLoopsME;
import java.util.Scanner;
public class P12_TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean founded = false;
        int count = 0;
        String password = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {

                        if (i < j && k > l && (i * j) + (k * l) == number) {
                            count++;
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                            if (count == 4) {
                                password = String.valueOf(i) + String.valueOf(j) + String.valueOf(k) + String.valueOf(l);
                                founded = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        if (founded) {
            System.out.printf("Password: %s", password);
        } else {
            System.out.print("No!");
        }
    }
}
