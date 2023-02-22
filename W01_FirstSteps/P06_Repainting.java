package W01_FirstSteps;

import java.util.Scanner;
public class P06_Repainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Предпазен найлон - 1.50 лв. за кв. метър
        Боя - 14.50 лв. за литър
        Разредител за боя - 5.00 лв. за литър*/

        //1. Четем от конзолата
        //2. Пресмятаме колко струват всички материали
        //3. Пресмятаме колко струва на час работата на майсторите
        //4. Изчисляваме цялата сума за ремонта
        //5. Принтираме

        int neededNylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (neededNylon + 2) * 1.50;
        double paintPrice = (neededPaint + (neededPaint * 0.1)) * 14.50;// neededPaint * 1.1
        double thinnerPrice = thinner * 5.00;

        double materialsSum = nylonPrice + paintPrice + thinnerPrice + 0.40;

        double priceForBuilders = hours * (materialsSum * 0.30); // materialsSum - (materialsSum * 0.7)

        double finalSum = priceForBuilders + materialsSum;

        System.out.println(finalSum);

    }
}