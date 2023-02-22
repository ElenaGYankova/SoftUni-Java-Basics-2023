package W06_NestedLoops;
import java.util.Scanner;
public class P05_SpecialNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int currentNum = 1111; currentNum <= 9999 ; currentNum++) {

            int first = currentNum / 1000;
            int second = currentNum / 100 % 10;
            int third = currentNum / 10 % 10;
            int fourth = currentNum % 10;


            boolean checkFirstDigit = number % first == 0;
            boolean checkSecondDigit = second != 0 && number % second == 0;
            boolean checkThirdDigit = third != 0 && number % third == 0;
            boolean checkFourthDigit = fourth != 0 && number % fourth == 0;

            if (checkFirstDigit && checkSecondDigit && checkThirdDigit && checkFourthDigit){
                System.out.printf("%d ", currentNum);
            }



        }
    }
}
