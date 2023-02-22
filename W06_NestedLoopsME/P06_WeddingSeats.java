package W06_NestedLoopsME;
import java.util.Scanner;
public class P06_WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastSector = scanner.nextLine();
        int firstRow = Integer.parseInt(scanner.nextLine());
        int oddSeats = Integer.parseInt(scanner.nextLine());
        char first = lastSector.charAt(0);
        int seat = 0;

        for (char i = 'A'; i <= first; i++) {
            if (i > 'A') {
                firstRow++;
            }
            char initial = 'a';
            for (int j = 1; j <= firstRow; j++) {
                initial = 'a';
                if (!(j % 2 == 0)){
                    for (int k = 1; k <= oddSeats; k++) {
                        System.out.printf("%c%d%c\n", i, j, initial);
                        initial++;
                        seat++;
                    }
                } else {
                    for (int k = 1; k <= (oddSeats + 2); k++) {
                        System.out.printf("%c%d%c\n", i, j, initial);
                        initial++;
                        seat++;
                    }
                }
            }
        }
        System.out.println(seat);
    }
}
