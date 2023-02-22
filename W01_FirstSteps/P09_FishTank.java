package W01_FirstSteps;

import java.util.Scanner;
public class P09_FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме входа от конзолата
        //2. Пресмятаме обема на аквариума в литри
        //3. Изваждаме от цялото киличество процента зает от пясък, растения и т.нат.
        //4. Принтираме

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentFilledSpace = Double.parseDouble(scanner.nextLine());

        double volumeInLitres = (length * width * height) * 0.001;

        double neededLitres = volumeInLitres * (1 - percentFilledSpace / 100);

        System.out.println(neededLitres);
    }
}
