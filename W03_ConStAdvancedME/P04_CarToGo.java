package W03_ConStAdvancedME;
import java.util.Scanner;
public class P04_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String classes = "";
        double price = 0;
        String type = "";

        if (budget <= 100){
            classes = "Economy class";
            if (season.equals("Summer")){
                type = "Cabrio";
                price = budget * 0.35;
            } else if (season.equals("Winter")){
                type = "Jeep";
                price = budget * 0.65;
            }
        } else if (budget <= 500){
            classes = "Compact class";
            if (season.equals("Summer")){
                type = "Cabrio";
                price = budget * 0.45;
            } else if (season.equals("Winter")){
                type = "Jeep";
                price = budget * 0.80;
            }
        } else {
            classes = "Luxury class";
            type = "Jeep";
            price = budget * 0.90;
        }
        System.out.println(classes);
        System.out.printf("%s - %.2f", type, price);
    }
}
