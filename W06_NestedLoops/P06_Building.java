package W06_NestedLoops;

import java.util.Scanner;
public class P06_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());

        for (int floor = countFloors; floor >= 1; floor--) {
            for (int room = 0; room < countRooms; room++) {

                String typeRoom = "";
                if (floor == countFloors) {
                    typeRoom = "L";
                } else if (floor % 2 != 0) {
                    typeRoom = "A";
                } else {
                    typeRoom = "O";
                }
                System.out.printf("%s%d%d ", typeRoom, floor, room);
            }
            System.out.println();
        }
    }
}