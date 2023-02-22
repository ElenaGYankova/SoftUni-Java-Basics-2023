package W06_NestedLoops;

import java.util.Scanner;
public class P06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int countAllTickets = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidsCount = 0;
        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int counterTickets = 0;
            String command = scanner.nextLine();
            while (!command.equals("End")) {
                String typeTicket = command;

                counterTickets++;
                countAllTickets++;

                switch (typeTicket) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidsCount++;
                        break;
                }

                if (counterTickets == freeSeats){
                    break;
                }

                command = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, counterTickets * 1.0 / freeSeats * 100);

            input = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", countAllTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCount * 1.0 / countAllTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCount * 1.0 / countAllTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidsCount * 1.0 / countAllTickets * 100);
    }
}