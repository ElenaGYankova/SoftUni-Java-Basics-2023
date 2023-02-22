package W03_ConStAdvancedME;
import java.util.Scanner;
public class P07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String gender = scanner.nextLine();
        int numberStudents = Integer.parseInt(scanner.nextLine());
        int numberNights = Integer.parseInt(scanner.nextLine());

        String type = "";
        double price = 0;

        if (season.equals("Winter")){
            if (gender.equals("girls")) {
                type = "Gymnastics";
                price = 9.60;
            } else if (gender.equals("boys")){
                type = "Judo";
                price = 9.60;
            } else {
                type = "Ski";
                price = 10;
            }
        } else if (season.equals("Spring")) {
            if (gender.equals("girls")){
                type = "Athletics";
                price = 7.20;
            } else if (gender.equals("boys")){
                type = "Tennis";
                price = 7.20;
            } else {
                type = "Cycling";
                price = 9.50;
            }
        } else if (season.equals("Summer")) {
            if (gender.equals("girls")){
                type = "Volleyball";
                price = 15;
            } else if (gender.equals("boys")){
                type = "Football";
                price = 15;
            } else {
                type = "Swimming";
                price = 20;
            }
        }
        if (numberStudents >= 50){
            price = price - (price * 0.50);
        } else if (numberStudents >= 20){
            price = price - (price * 0.15);
        } else if (numberStudents >= 10){
            price = price - (price * 0.05);
        }
        double calc = (numberStudents * numberNights) * price;
        System.out.printf("%s %.2f lv.", type, calc);
    }
}
