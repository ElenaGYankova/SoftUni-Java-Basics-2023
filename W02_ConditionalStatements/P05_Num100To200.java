package W02_ConditionalStatements;

import java.util.Scanner;

public class P05_Num100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());

        if (value < 100) {
            System.out.println("Less than 100");
        } else if (value <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");

        }

    }
    }
