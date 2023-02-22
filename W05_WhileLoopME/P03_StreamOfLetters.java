package W05_WhileLoopME;
import java.util.Scanner;
public class P03_StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cmdWord;
        boolean cmdC = false;
        boolean cmdO = false;
        boolean cmdN = false;
        char symbol;
        int ascii;
        String result = "";
        String totalResult = "";

        cmdWord = scanner.nextLine();
        while (!cmdWord.equals("End")){
            symbol = cmdWord.charAt(0);
            ascii = (int)symbol;
            if((ascii >= 0x41 && ascii <= 0x5A)||(ascii >= 0x61 && ascii <= 0x7A)){

                if((symbol=='c' && cmdC==true) || (symbol=='o' && cmdO==true) || (symbol=='n' && cmdN==true) ||
                        (symbol!='c' && symbol!='o' && symbol!='n')){
                    result += symbol;
                }

                if (symbol == 'c') {cmdC = true;
                }else if(symbol=='o'){cmdO = true;
                }else if(symbol=='n'){cmdN = true;}

                if(cmdC==true && cmdO==true && cmdN==true){
                    totalResult += result + " ";
                    result = "";                    //RES
                    cmdC = false;
                    cmdO = false;
                    cmdN = false;
                }
            }
            cmdWord = scanner.nextLine();
        }
        System.out.println(totalResult);
    }
}
