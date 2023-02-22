package W07_DrawingFiguresWithLoopsME;
import java.util.Scanner;
public class P10_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int stars = 1;
        int dashesOut = (n-1)/2;
        int dashesIn = n-4;


        if (n%2==0){
            for (int row = 0; row < n/2; row++) {
                System.out.println(repeatString("-", dashesOut) +
                        "*" +
                        repeatString("-", 2 * row) +
                        "*" +
                        repeatString("-", dashesOut));
                dashesOut--;
            }
            dashesOut = 1;
            for (int row = 0; row < (n/2)-1; row++) {
                System.out.println(repeatString("-", dashesOut) +
                        "*" +
                        repeatString("-", dashesIn) +
                        "*" +
                        repeatString("-", dashesOut));
                dashesIn -= 2;
                dashesOut ++;

            }

        } else {
            int starsTwo = 1;
            if (n==1) {
                starsTwo = 0;
            } else {
                System.out.println(repeatString("-", (n - 1) / 2) +
                        repeatString("*", starsTwo) +
                        repeatString("-", (n - 1) / 2));
            }
            for (int row = 0; row < n/2; row++) {
                System.out.println(repeatString("-", dashesOut-1) +
                        "*" +
                        repeatString("-", 2 * row + 1) +
                        "*" +
                        repeatString("-", dashesOut-1));
                dashesOut--;
            }

            for (int row = 0; row < n/2-1; row++) {
                System.out.println(repeatString("-", row + 1) +
                        "*" +
                        repeatString("-", dashesIn) +
                        "*" +
                        repeatString("-", row + 1));
                dashesIn -= 2;
                dashesOut++;
            }
            System.out.println(repeatString("-", (n - 1)/2) +
                    "*" +
                    repeatString("-", (n - 1)/2) );
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
