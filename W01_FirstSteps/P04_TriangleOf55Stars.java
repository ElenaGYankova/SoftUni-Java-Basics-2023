package W01_FirstSteps;

public class P04_TriangleOf55Stars {
    public static void drowStars(int starNumber){
        for(int i = 1; i <= starNumber; i++){
            if(i == 1){
                System.out.print("*");
            }
            else{
                System.out.print("*");
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) {

        for(int i = 1; i<= 10; i++){
            drowStars(i);
        }
    }
}
