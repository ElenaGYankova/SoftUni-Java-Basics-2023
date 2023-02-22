package L2_1_SimpleCalculations;

import java.util.Scanner;
public class P01_SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int side = Integer.parseInt(input);

        int squareArea = side * side;

        System.out.println(squareArea);
    }
}
