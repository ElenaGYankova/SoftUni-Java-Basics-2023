package W02_ConditionalStatementsME;
import java.util.Scanner;
public class P08_FuelTankPart2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelAmount = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double gasolinePrice = 2.22;
        double gasPrice = 0.93;
        double dieselPrice = 2.33;

        double gasolinePriceWithClubCard = gasolinePrice - 0.18;
        double gasPriceWithClubCard = gasPrice - 0.08;
        double dieselPriceWithClubCard = dieselPrice - 0.12;

        double result = 0;

        if (fuelAmount >= 20 && fuelAmount <= 25 && clubCard.equals("Yes"))
        {
            if (fuelType.equals("Gasoline"))
            {
                gasolinePriceWithClubCard = gasolinePriceWithClubCard - (gasolinePriceWithClubCard * 0.08);
                result = gasolinePriceWithClubCard * fuelAmount;
            }
            else if (fuelType.equals("Gas"))
            {
                gasPriceWithClubCard = gasPriceWithClubCard - (gasPriceWithClubCard * 0.08);
                result = gasPriceWithClubCard * fuelAmount;
            }
            else if (fuelType.equals("Diesel"))
            {
                dieselPriceWithClubCard = dieselPriceWithClubCard - (dieselPriceWithClubCard * 0.08);
                result = dieselPriceWithClubCard * fuelAmount;
            }
        }
        else if (fuelAmount >= 20 && fuelAmount <= 25 && clubCard.equals("No"))
        {
            if (fuelType.equals("Gasoline"))
            {
                gasolinePrice = gasolinePrice - (gasolinePrice * 0.08);
                result = gasolinePrice * fuelAmount;
            }
            else if (fuelType.equals("Gas"))
            {
                gasPrice = gasPrice - (gasPrice * 0.08);
                result = gasPrice * fuelAmount;
            }
            else if (fuelType.equals("Diesel"))
            {
                dieselPrice = dieselPrice - (dieselPrice * 0.08);
                result = dieselPrice * fuelAmount;
            }
        }
        else if (fuelAmount > 25 && clubCard.equals("Yes"))
        {
            if (fuelType.equals("Gasoline"))
            {
                gasolinePriceWithClubCard = gasolinePriceWithClubCard - (gasolinePriceWithClubCard * 0.10);
                result = gasolinePriceWithClubCard * fuelAmount;
            }
            else if (fuelType.equals("Gas"))
            {
                gasPriceWithClubCard = gasPriceWithClubCard - (gasPriceWithClubCard * 0.10);
                result = gasPriceWithClubCard * fuelAmount;
            }
            else if (fuelType.equals("Diesel"))
            {
                dieselPriceWithClubCard = dieselPriceWithClubCard - (dieselPriceWithClubCard * 0.10);
                result = dieselPriceWithClubCard * fuelAmount;
            }
        }
        else if (fuelAmount > 25 && clubCard.equals("No"))
        {
            if (fuelType.equals("Gasoline"))
            {
                gasolinePrice = gasolinePrice - (gasolinePrice * 0.10);
                result = gasolinePrice * fuelAmount;
            }
            else if (fuelType.equals("Gas"))
            {
                gasPrice = gasPrice - (gasPrice * 0.10);
                result = gasPrice * fuelAmount;
            }
            else if (fuelType.equals("Diesel"))
            {
                dieselPrice = dieselPrice - (dieselPrice * 0.10);
                result = dieselPrice * fuelAmount;
            }
        }
        else if (clubCard.equals("Yes"))
        {
            if (fuelType.equals("Gasoline"))
            {
                result = gasolinePriceWithClubCard * fuelAmount;
            }
            else if (fuelType.equals("Gas"))
            {
                result = gasPriceWithClubCard * fuelAmount;
            }
            else if (fuelType.equals("Diesel"))
            {
                result = dieselPriceWithClubCard * fuelAmount;
            }
        }
        else
        {
            if (fuelType.equals("Gasoline"))
            {
                result = gasolinePrice * fuelAmount;
            }

            else if (fuelType.equals("Gas"))
            {
                result = gasPrice * fuelAmount;
            }

            else if (fuelType.equals("Diesel"))
            {
                result = dieselPrice * fuelAmount;
            }
        }
        System.out.printf("%.2f lv." , result);

    }
}
