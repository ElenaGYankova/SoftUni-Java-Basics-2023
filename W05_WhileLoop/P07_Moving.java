package W05_WhileLoop;
import java.util.Scanner;
public class P07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int sumDeposit = width * length * height;
        String command = scanner.nextLine();

        while (!command.equals("Done")){
            int boxes = Integer.parseInt(command);
            sumDeposit -= boxes;;
            if (sumDeposit <= 0){
                break;
            }
            command = scanner.nextLine();
        }
        if (sumDeposit > 0){
            System.out.printf("%d Cubic meters left.", sumDeposit);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(sumDeposit));
        }
    }
}
