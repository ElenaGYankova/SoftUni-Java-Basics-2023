package W04_ForLoop;
import java.util.Scanner;
public class P07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        double mussala = 0;
        double monblan = 0;
        double kilimadjaro = 0;
        double k2 = 0;
        double everest = 0;
        double allPpl = 0;

        for (int i = 1; i <= groups; i++) {

            int pplOfEveryGroup = Integer.parseInt(scanner.nextLine());
            allPpl += pplOfEveryGroup;
            if (pplOfEveryGroup <= 5) {
                mussala += pplOfEveryGroup;
            } else if (pplOfEveryGroup <= 12) {
                monblan += pplOfEveryGroup;
            } else if (pplOfEveryGroup <= 25) {
                kilimadjaro += pplOfEveryGroup;
            } else if (pplOfEveryGroup <= 40) {
                k2 += pplOfEveryGroup;
            } else {
                everest += pplOfEveryGroup;
            }
        }
        mussala = (mussala / allPpl) * 100;
        monblan = (monblan / allPpl) * 100;
        kilimadjaro = (kilimadjaro / allPpl) * 100;
        k2 = (k2 / allPpl) * 100;
        everest = (everest / allPpl) * 100;

        System.out.printf("%.2f%%%n", mussala);
        System.out.printf("%.2f%%%n", monblan);
        System.out.printf("%.2f%%%n", kilimadjaro);
        System.out.printf("%.2f%%%n", k2);
        System.out.printf("%.2f%%%n", everest);

    }
}
