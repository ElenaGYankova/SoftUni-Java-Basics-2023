package W04_ForLoopME;
import java.util.Scanner;
public class P01_BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int currentYears = 18;
        double currentMoney = money;
        double spend = 0;

        for (int i = 1800; i <= year ; i++) {
            if (i % 2 == 0){
                currentMoney -= 12000;
            } else {
                spend = 12000 + (currentYears * 50);
                currentMoney -= spend;
            }
            currentYears++;
        }
        if (currentMoney >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", currentMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(currentMoney));
        }
    }
}
