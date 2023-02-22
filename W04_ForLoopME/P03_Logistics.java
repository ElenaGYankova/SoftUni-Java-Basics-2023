package W04_ForLoopME;
import java.util.Scanner;
public class P03_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        double microBus = 0;
        double tir = 0;
        double train = 0;

        for (int i = 1; i <= quantity; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            sum += tons;

            if (tons <= 3){
                microBus += tons;
            } else if (tons <= 11){
                tir += tons;
            } else {
                train += tons;
            }
        }
        double sumMicroBus = microBus * 200;
        double sumTir = tir * 175;
        double sumTrain = train * 120;

        double sumAll = (sumMicroBus + sumTir + sumTrain) / sum;
        microBus = (microBus / sum) * 100;
        tir = (tir / sum) * 100;
        train = (train / sum) * 100;

        System.out.printf("%.2f%n", sumAll);
        System.out.printf("%.2f%%%n", microBus);
        System.out.printf("%.2f%%%n", tir);
        System.out.printf("%.2f%%%n", train);
    }
}
