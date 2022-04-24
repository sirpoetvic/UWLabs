 package YazInterpreterUWLab_Folder;
 import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
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
            noSelectedOption = false;
        }
        else {
            optionSelect(sc);
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

     public static void contentConverter(Scanner sc) throws FileNotFoundException {
        System.out.println("input file name?");
        String inputFile = sc.nextLine();
        Scanner input = new Scanner(new File("..\\UWLabs\\YazInterpreterUWLab_Folder\\" + inputFile));
        while(input.hasNextLine()) {
            
        }
     }

     public static void quit() {
         programRunning = false;
     }

     
 }