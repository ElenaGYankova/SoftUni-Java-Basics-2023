package W01_FirstSteps;

import java.util.Scanner;
public class P02_RadiansToDegrees {
    public static void main(String[] args) {

        //1. Преобразуваме от радиани в градуси -> градус = радиан * 180 / π

        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;

        System.out.println(degrees);
    }
}