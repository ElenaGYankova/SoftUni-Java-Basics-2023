package W03_ConStAdvancedME;
import java.util.Scanner;
public class P03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrizantemiBroi = Integer.parseInt(scanner.nextLine());
        int roziBroi = Integer.parseInt(scanner.nextLine());
        int laletaBroi = Integer.parseInt(scanner.nextLine());
        String sezon = scanner.nextLine();
        String praznikLiE = scanner.nextLine();

        double hrizantemicena = 0;
        double rozicena = 0;
        double laletacena = 0;
        double cenatotal = 0;
        int broiTotal = hrizantemiBroi + roziBroi + laletaBroi;

        if ("Spring".equals(sezon) || "Summer".equals(sezon)) {
            hrizantemicena = 2 * hrizantemiBroi;
            rozicena = 4.1 * roziBroi;
            laletacena = 2.5 * laletaBroi;
            cenatotal = hrizantemicena + rozicena + laletacena;
            if ("Y".equals(praznikLiE)) {
                cenatotal = cenatotal + cenatotal * 0.15;
                if (laletaBroi > 7) {
                    cenatotal = cenatotal - cenatotal * 0.05;
                }
                if (broiTotal > 20) {
                    cenatotal = cenatotal - cenatotal * 0.2;

                }
            } else {
                if (laletaBroi > 7) {
                    cenatotal = cenatotal - cenatotal * 0.05;
                }
                if (broiTotal > 20) {
                    cenatotal = cenatotal - cenatotal * 0.2;

                }
            }
        }
        else if ("Autumn".equals(sezon) || "Winter".equals(sezon)) {
            hrizantemicena = 3.75 * hrizantemiBroi;
            rozicena = 4.5 * roziBroi;
            laletacena = 4.15 * laletaBroi;
            cenatotal = hrizantemicena + rozicena + laletacena;
            if ("Y".equals(praznikLiE)) {
                cenatotal = cenatotal + cenatotal * 0.15;
                if (roziBroi >= 10 && "Winter".equals(sezon)) {
                    cenatotal = cenatotal - cenatotal * 0.1;
                }
                if (broiTotal > 20) {
                    cenatotal = cenatotal - cenatotal * 0.2;
                }
            } else {
                if (roziBroi >= 10 && "Winter".equals(sezon)) {
                    cenatotal = cenatotal - cenatotal * 0.1;
                }
                if (broiTotal > 20) {
                    cenatotal = cenatotal - cenatotal * 0.2;
                }
            }
        }
        double cenatotalAran = cenatotal + 2;
        System.out.printf("%.2f", cenatotalAran);
    }
}
