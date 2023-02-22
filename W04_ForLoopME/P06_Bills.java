package W04_ForLoopME;
import java.util.Scanner;
public class P06_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mounts = Integer.parseInt(scanner.nextLine());
        double water =20;
        double sumWater = 0;
        double internet = 15;
        double sumInternet = 0;
        double others = 0;
        double electricity = 0;
        double sum = 0;
        double sumOther = 0;

        for (int i = 1; i <= mounts; i++) {

            double currentElectricity = Double.parseDouble(scanner.nextLine());
            sum += currentElectricity;
            electricity += currentElectricity;
            sumWater += water;
            sumInternet += internet;
            others = currentElectricity + water + internet;
            sumOther += others + (others * 0.20);
        }
        double average = (electricity + sumWater + sumInternet + sumOther) / mounts;
        System.out.printf("Electricity: %.2f lv\n", electricity);
        System.out.printf("Water: %.2f lv\n", sumWater);
        System.out.printf("Internet: %.2f lv\n", sumInternet);
        System.out.printf("Other: %.2f lv\n", sumOther);
        System.out.printf("Average: %.2f lv", average);
    }
}
