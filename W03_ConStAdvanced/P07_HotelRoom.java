package W03_ConStAdvanced;

import java.util.Scanner;

public class P07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        //May, June, July, August, September или October
        double apartmentPrice = 0;
        double studioPrice = 0;

        switch (month){
            case "May":
            case "October":
                apartmentPrice = countNights * 65;
                studioPrice = countNights * 50;
                if (countNights > 14){
                    apartmentPrice = apartmentPrice * 0.9;
                    studioPrice = studioPrice * 0.7;
                }else if(countNights > 7) {
                    studioPrice = studioPrice * 0.95;

                }

                break;
            case "June":
            case "September":
                apartmentPrice = countNights * 68.70;
                studioPrice = countNights * 75.20;
                if(countNights > 14){
                    apartmentPrice = apartmentPrice * 0.9;
                    studioPrice = studioPrice * 0.8;
                }

                break;

            case "July":
            case "August":
                apartmentPrice = countNights * 77;
                studioPrice = countNights * 76;
                if(countNights > 14){
                    apartmentPrice = apartmentPrice * 0.9;

                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}