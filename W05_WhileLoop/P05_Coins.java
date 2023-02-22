package W05_WhileLoop;
import java.util.Scanner;
public class P05_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double insertCoins = Double.parseDouble(scanner.nextLine());
        double sumCoins = Math.floor(insertCoins * 100);
        int sumCents = 0;

        while (!(sumCoins == 0)){

            if (sumCoins >= 200){
                sumCents++;
                sumCoins -= 200;
            } else if (sumCoins >= 100){
                sumCents++;
                sumCoins -= 100;
            } else if (sumCoins >= 50){
                sumCents++;
                sumCoins -= 50;
            } else if (sumCoins >= 20){
                sumCents++;
                sumCoins -= 20;
            } else if (sumCoins >= 10){
                sumCents++;
                sumCoins -= 10;
            } else if (sumCoins >= 5){
                sumCents++;
                sumCoins -= 5;
            } else if (sumCoins >= 2){
                sumCents++;
                sumCoins -= 2;
            } else if (sumCoins >= 1){
                sumCents++;
                sumCoins -= 1;
            }
        }
        System.out.printf("%d", sumCents);
    }
}
