package W03_ConStAdvancedME;
import java.util.Scanner;
public class P06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometers = Double.parseDouble(scanner.nextLine());
        double pay = 0;

        switch (season){
            case "Spring":
            case "Autumn":
                if (kilometers <= 5000){
                    pay = 0.75;
                } else if (kilometers <= 10000){
                    pay = 0.95;
                } break;
            case "Summer":
                if (kilometers <= 5000){
                    pay = 0.90;
                } else if (kilometers <= 10000){
                    pay = 1.10;
                } break;
            case "Winter":
                if (kilometers <= 5000){
                    pay = 1.05;
                } else if (kilometers <= 10000){
                    pay = 1.25;
                } break;
        }
        if (kilometers > 10000){
            pay = 1.45;
        }
        double sumKilometers = kilometers * pay;
        double salary = sumKilometers * 4;
        double tax = salary * 0.10;
        double total = salary - tax;

        System.out.printf("%.2f", total);
    }
}
