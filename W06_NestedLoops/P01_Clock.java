package W06_NestedLoops;

public class P01_Clock {
    public static void main(String[] args) {
        for (int hour = 0; hour <= 23; hour++) {
            for (int min = 0; min <= 59; min++) {
                System.out.printf("%d:%d%n", hour, min);
            }
        }
    }
}