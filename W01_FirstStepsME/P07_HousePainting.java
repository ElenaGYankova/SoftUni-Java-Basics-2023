package W01_FirstStepsME;
import java.util.Scanner;
public class P07_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пишем входовете
        // пресмятаме размера на стените и покрива, като се има в напредвид, че прозореца е 1,5
        // принтираме нужните литри боя за стените и покривът.

        double heightSide = Double.parseDouble(scanner.nextLine());
        double lengthSide= Double.parseDouble(scanner.nextLine());
        double heightTriangle= Double.parseDouble(scanner.nextLine());

        //стени
        double sideWall = heightSide * lengthSide;
        double window = 1.5 * 1.5;
        double sideWalls = (2 * sideWall) - (2 * window);
        double backSide = heightSide * heightSide;
        double entry = 1.2 * 2;
        double frontAndBackSide = (2 * backSide) - entry;
        double totalSide = sideWalls + frontAndBackSide;
        double greenPaint = totalSide / 3.4;
        //покрив
        double calcRoofSide = 2 * (heightSide * lengthSide);
        double calcRoof = 2 * (heightSide * heightTriangle / 2);
        double totalRoof = calcRoofSide + calcRoof;
        double redPaint = totalRoof / 4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);

    }
}
