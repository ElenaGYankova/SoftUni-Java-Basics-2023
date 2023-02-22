package W01_FirstSteps;

import java.util.Scanner;
public class P04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Брой страници в текущата книга – цяло число в интервала [1…1000]
        //2. Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        //3. Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesForDay = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int allBookH = pages/pagesForDay;
        int hForDay = allBookH/days;

        System.out.println(hForDay);
    }
}
