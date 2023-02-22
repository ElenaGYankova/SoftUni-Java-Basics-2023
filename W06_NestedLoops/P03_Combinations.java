package W06_NestedLoops;

import java.util.Scanner;
public class P03_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //0 -> 25
        //0 + 0 + 25 == 25

        int countValidComb = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    int sum = i + j + k;

                    if (sum == n) {
                        countValidComb++;
                    }
                }
            }
        }

        System.out.println(countValidComb);
    }
}