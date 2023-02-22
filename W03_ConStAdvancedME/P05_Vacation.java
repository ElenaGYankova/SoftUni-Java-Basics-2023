package W03_ConStAdvancedME;
import java.util.Scanner;
public class P05_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        String location = "";
        String type = "";

        if (budget <= 1000){
            type = "Camp";
            if (season.equals("Summer")){
                location = "Alaska";
                price = budget * 0.65;
            } else if (season.equals("Winter")){
                location = "Morocco";
                price = budget * 0.45;
            }
        } else if (budget <= 3000){
            type = "Hut";
            if (season.equals("Summer")){
                location = "Alaska";
                price = budget * 0.80;
            } else if (season.equals("Winter")){
                location = "Morocco";
                price = budget * 0.60;
            }
        } else {
            type = "Hotel";
            if (season.equals("Summer")){
                location = "Alaska";
                price = budget * 0.90;
            } else if (season.equals("Winter")){
                location = "Morocco";
                price = budget * 0.90;
            }
        }
        System.out.printf("%s - %s - %.2f", location, type, price);
    }
}
