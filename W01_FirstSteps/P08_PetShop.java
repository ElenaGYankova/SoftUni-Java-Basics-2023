package W01_FirstSteps;
import java.util.Scanner;
public class P08_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double countDog = Double.parseDouble(scanner.nextLine());
        double countCat = Double.parseDouble(scanner.nextLine());
        double cats = countCat*4.00;
        double dogs = countDog*2.50;
        double total = dogs+cats;
        System.out.println(total + " lv ");
    }
}
