package W03_ConStAdvanced;
import java.util.Scanner;
public class P_TownShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;
        if (town.equals("Sofia")){
            if (product.equals("coffee")){
                price = 0.5;
            } else if (product.equals("water")) {
                price = 0.8;
            } else if (product.equals("beer")){
                price = 1.2;
            } else if (product.equals("sweets")) {
                price = 1.45;
            } else if (product.equals("peanuts")) {
                price = 1.6;
            }
        } else if (town.equals("Plovdiv")){
            switch (product){
                case "coffee":
                    price = 0.4;
                    break;
                case "water":
                    price = 0.7;
                    break;
                case "beer":
                    price = 1.15;
                    break;
                case "sweets":
                    price = 1.3;
                    break;
                case "peanuts":
                    price = 1.5;
                    break;
            }
        } else if (town.equals("Varna")){
            switch (product){
                case "coffee":
                    price = 0.45;
                    break;
                case "water":
                    price = 0.7;
                    break;
                case "beer":
                    price = 1.1;
                    break;
                case "sweets":
                    price = 1.35;
                    break;
                case "peanuts":
                    price = 1.55;
                    break;
            }
        }
        double total = quantity * price ;
        System.out.printf("%f", Math.abs(total));
    }
}
