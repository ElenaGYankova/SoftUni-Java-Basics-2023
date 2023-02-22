package W01_FirstSteps;

import java.util.Scanner;
public class P08_BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Четем от конзолата
        // 2. Пресмятаме
        //- цената за кецове
        //- цената за екип
        //- цената за топката
        //- цената за аксесоарите
        //3. Пресмятаме всички разходи -> такса + кецове + екип + топка + аксесоари
        //4. Принтираме


/*        •   Баскетболни кецове – цената им е 40% по-малка от таксата за една година
• Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
• Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
• Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка*/


        int tax = Integer.parseInt(scanner.nextLine());

        double trainersPrice = tax - tax * 0.4;// tax * 0.6

        double suit = trainersPrice * 0.8; // trainersPrice - trainersPrice * 0.20

        double ball = suit / 4; // suit * 0.25

        double accessories = ball / 5; //ball * 0.2

        double finalPrice = trainersPrice + suit + ball + accessories + tax;

        System.out.println(finalPrice);

    }
}