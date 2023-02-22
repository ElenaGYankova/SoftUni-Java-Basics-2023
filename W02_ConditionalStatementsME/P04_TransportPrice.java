package W02_ConditionalStatementsME;

import java.util.Scanner;

public class P04_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String dayNight = scanner.nextLine();

        double taxiStart = 0.7;
        double taxiDayKm = 0.79;
        double taxiNightKm = 0.90;
        double busKm = 0.09;
        double trainKm = 0.06;

        double priceTransport = 0.0;

        if (n<20 && dayNight.equals("day")) {
            priceTransport = (n*taxiDayKm)+taxiStart;
        } else if (n<20 && dayNight.equals("night")){
            priceTransport = (n*taxiNightKm)+taxiStart;
        }

        if (n>=20 && n<100) {
            priceTransport = n*busKm;
        } else if (n>=100) {
            priceTransport = n*trainKm;
        } else if (n<=1 && n>=5000) {
            n=n;
        } else {
            n=0;
        }

        if (dayNight.equals("day")) {
            dayNight=dayNight;
        } else if (dayNight.equals("night")) {
            dayNight=dayNight;
        } else {
            dayNight="";
        }
        System.out.printf("%.2f", priceTransport);
    }
}