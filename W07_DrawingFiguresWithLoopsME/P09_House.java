package W07_DrawingFiguresWithLoopsME;
import java.util.Scanner;
public class P09_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int stars = 1;

        if (n%2==0) {
            stars = 2;
        }

        int countRowRoof = (n+1)/2;
        int dashes = (n-stars)/2;
        for (int rowRoof = 0; rowRoof < countRowRoof; rowRoof++) {
            System.out.print(repeatString("-", dashes));
            System.out.print(repeatString("*", stars));
            System.out.println(repeatString("-", dashes));
            stars += 2;
            dashes --;
        }

        int countRowBody = n/2;
        for (int rowBody = 0; rowBody < countRowBody; rowBody++) {
            System.out.print(repeatString("|", 1));
            System.out.print(repeatString("*", n-2));
            System.out.println(repeatString("|",1));
        }
    }
    static String repeatString(String toRepeat, int count) {
        String text = "";

        for (int i = 1; i <=count; i++) {
            text = text + toRepeat;
        }
        return  text;
    }
}
