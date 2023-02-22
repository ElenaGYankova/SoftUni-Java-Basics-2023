package W03_ConStAdvanced;

import java.util.Scanner;

public class P06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Четем от конзолата
        //2. Switch по оператора
        //  2.2. При +, - *, правим проверкам дали резултата е четен
        //  2.3. При /, % - правим проверка дали второто число е 0

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator){
            case "+":
                int sum = number1 + number2;
                if(sum % 2 == 0){
                    System.out.printf("%d %s %d = %d - even", number1, operator, number2, sum);
                }else {
                    System.out.printf("%d %s %d = %d - odd", number1, operator, number2, sum);
                }
                break;

            case "-":
                int diff = number1 - number2;
                if(diff % 2 == 0){
                    System.out.printf("%d %s %d = %d - even", number1, operator, number2, diff);
                }else {
                    System.out.printf("%d %s %d = %d - odd", number1, operator, number2, diff);
                }
                break;

            case "*":
                int result = number1 * number2;
                if(result % 2 == 0){
                    System.out.printf("%d * %d = %d - even", number1,  number2, result);
                }else {
                    System.out.printf("%d * %d = %d - odd", number1,  number2, result);
                }
                break;

            case "/":
                if(number2 == 0){
                    System.out.printf("Cannot divide %d by zero", number1);
                }else {
                    double division = number1 * 1.0 / number2;
                    System.out.printf("%d / %d = %.2f", number1, number2, division);
                }
                break;

            case "%":
                if (number2 == 0){
                    System.out.printf("Cannot divide %d by zero", number1);
                }else {
                    int leftover = number1 % number2;
                    System.out.printf("%d %% %d = %d", number1, number2, leftover);
                }
                break;
        }

    }
}