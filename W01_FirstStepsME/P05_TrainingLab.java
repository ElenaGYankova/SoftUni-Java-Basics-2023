package W01_FirstStepsME;
import java.util.Scanner;
public class P05_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double bInCm = b * 100.0;
        double corridor = 100;
        double leftB = bInCm - corridor;
        int maxDeckPerRow = (int) leftB / 70;
        double wInCm = w * 100.0;
        int maxDeckPerlength = (int) wInCm / 120;
        int countPlace = maxDeckPerRow * maxDeckPerlength - 3;
        System.out.println(countPlace);
    }
}