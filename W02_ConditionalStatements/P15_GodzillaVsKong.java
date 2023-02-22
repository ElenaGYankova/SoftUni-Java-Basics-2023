package W02_ConditionalStatements;

import java.util.Scanner;

public class P15_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Четем от конзолата
        //2. Пресмятаме цената за декора -> 10% от бюджета
        //3. Пресмятаме цената за облеклото
        //4. Проверяваме дали статистите са повече от 150
        //5. Пресмятаме колко е финалната сума -> цената за декор + цената за облекло
        //6. Проверяваме дали бюджетът е достатъчен
        // -> ако достатъчен - o   "Action!"
        //o                             "Wingard starts filming with {останалите пари} leva left."
        // -> ако не е достатъчен -> o  "Not enough money!"
        //o                             "Wingard needs {парите недостигащи за филма} leva more."


        double budget = Double.parseDouble(scanner.nextLine());
        int countExtras = Integer.parseInt(scanner.nextLine());
        double priceForOnePersonsCloths = Double.parseDouble(scanner.nextLine());

       /* •   Декорът за филма е на стойност 10% от бюджета.
• При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.*/

        double priceDecor = budget * 0.1;
        double priceForCloths = countExtras * priceForOnePersonsCloths;

        if (countExtras > 150){
            priceForCloths = priceForCloths * 0.9; //priceForCloths - priceForCloths * 0.1
        }

        double finalSum = priceDecor + priceForCloths;
        double difference = Math.abs(finalSum - budget);

        if(finalSum > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }

    }
}