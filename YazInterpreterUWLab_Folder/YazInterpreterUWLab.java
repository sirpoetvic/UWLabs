package YazInterpreterUWLab_Folder;
 
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

 public class YazInterpreterUWLab {
     static boolean programRunning = true;
     public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        printIntro();
        while (programRunning) {
            optionSelect(sc);
        }

        sc.close();
     }

     public static void printIntro() {
         System.out.println("Welcome to YazInterpreter!");
         System.out.println("You may interpret a YazLang program and output");
         System.out.println("the results to a file or view a previously");
         System.out.println("interpreted YazLang program.");
     }

     public static void optionSelect(Scanner sc) throws FileNotFoundException {
        System.out.println("(I)nterpret YazLang program, (V)iew output, (Q)uit? ");
        String response = sc.nextLine().toLowerCase();
        boolean noSelectedOption = true;

        while(noSelectedOption)
        if(response.equals("i")) {
            contentConverter(sc);
            noSelectedOption = false;
        } else if(response.equals("v")) {
            printContents(sc);
            noSelectedOption = false;
        } else if(response.equals("q")) {
            programRunning = false;
            noSelectedOption = false;
        }
        else {
            optionSelect(sc);
        }

     }

     public static void convert(String currentLine, Scanner stringCheck) {
        stringCheck.next();
        int temp = Integer.parseInt(stringCheck.next());
        String unit = stringCheck.next().toLowerCase();
        if(unit.equals("c"))
            double f = (1.8 * temp) + 32;
            System.out.println(f + "F");
        else if(unit.equals("F"))
            double c = (temp - 32) / 1.8;
            System.out.println(c + "C");
            
     }

     public static void range(Scanner stringCheck) {
        stringCheck.next();
        int firstNumber = Integer.parseInt(stringCheck.next());
        int secondNumber = Integer.parseInt(stringCheck.next());
        int thirdNumber = Integer.parseInt(stringCheck.next());
        for(firstNumber; firstNumber <= secondNumber; firstNumber += thirdNumber) {
            System.out.print(firstNumber + " ");
        }
        
     }

    @Override
     public static void repeat(Scanner stringCheck) {
        stringCheck.next();
        while(stringCheck.hasNext) {
            String repeated = stringcheck.next();
            int repeatNum = Integer.parseInt(stringCheck.next());
            for(int i = 0; i < repeatNum; i++) {
                System.out.print(repeated);
            }
        }
        }
     }

     public static void contentConverter(Scanner sc) throws FileNotFoundException {
        System.out.println("input file name?");
        String inputFile = sc.nextLine();
        Scanner input = new Scanner(new File("..\\UWLabs\\YazInterpreterUWLab_Folder\\" + inputFile));
        while(input.hasNextLine()) {
            String currentLine = input.nextLine();
            Scanner stringCheck = new Scanner(currentLine);
            if(currentLine.substring(0,7).equals("CONVERT")) {
                convert(stringCheck);
            }
            else if(currentLine.substring(0,5).equals("RANGE")) {
                range(stringCheck);
            }
            if(currentLine.substring(0,6).equals("REPEAT")) {
                repeat(stringCheck);
            }

        }
     }

     public static void printContents(Scanner sc) throws FileNotFoundException {
        System.out.println("input file name?");
        String inputFile = sc.nextLine();
        File file = new File("..\\UWLabs\\YazInterpreterUWLab_Folder\\" + inputFile);
        Scanner input = new Scanner(file);
        System.out.println(file.exists());
        while(input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
     }

     public static void quit() {
         programRunning = false;
     }

     
 }