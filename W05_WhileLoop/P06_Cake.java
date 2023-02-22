package W05_WhileLoop;
import java.util.Scanner;
public class P06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int totalPieces = width * length;
        String over = scanner.nextLine();

        while (!over.equals("STOP")){
            int currentPiece = Integer.parseInt(over);
            totalPieces -= currentPiece;
            if (totalPieces <= 0){
                break;
            }
            over = scanner.nextLine();
        }
        if (totalPieces >= 0){
            System.out.printf("%d pieces are left.", totalPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        }
    }
}
