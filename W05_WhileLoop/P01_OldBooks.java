package W05_WhileLoop;
import java.util.Scanner;
public class P01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String book = scanner.nextLine();
        int countBooks = 0;

        while (!book.equals("No More Books")){
            if (searchedBook.equals(book)){
                System.out.printf("You checked %d books and found it.", countBooks);
                break;
            }
            book = scanner.nextLine();
            countBooks++;
        }
        if (!searchedBook.equals(book)){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }

    }
}
