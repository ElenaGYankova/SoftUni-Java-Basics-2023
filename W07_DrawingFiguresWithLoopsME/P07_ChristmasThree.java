package W07_DrawingFiguresWithLoopsME;
import java.util.Scanner;
public class P07_ChristmasThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstLine = repeatStr(" ", n + 1)
                + "|";
        System.out.println(firstLine);

        for (int i = 1; i <=n; i++) {
            String loop = repeatStr(" ",n -i )
                    + repeatStr("*", i)
                    + " | "
                    + repeatStr("*", i)
                    + repeatStr(" ",n -i );
            System.out.println(loop);
        }
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
