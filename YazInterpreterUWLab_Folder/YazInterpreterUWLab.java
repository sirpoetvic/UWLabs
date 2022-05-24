package YazInterpreterUWLab_Folder;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class YazInterpreterUWLab {
    static boolean programRunning = true;
    static boolean consoleOutput = true;
    static PrintStream console = System.out;


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        printIntro();
        while (programRunning) {
            optionSelect(sc);
        }
        sc.close();
    }

    //Prints the "intro" message
    public static void printIntro() {
        System.out.println("Welcome to YazInterpreter!");
        System.out.println("You may interpret a YazLang program and output");
        System.out.println("the results to a file or view a previously");
        System.out.println("interpreted YazLang program.");
    }

    //Selects option
    //Interpret, View, Quit
    public static void optionSelect(Scanner sc) throws FileNotFoundException {
        System.out.println("(I)nterpret YazLang program, (V)iew output, (Q)uit? ");
        String response = sc.nextLine().toLowerCase();
        boolean noSelectedOption = true;

        while (noSelectedOption) {
            if (response.equals("i")) {
                consoleOutput = false;
                contentConverter(sc);
                programRunning = true;
                noSelectedOption = false;
            } else if (response.equals("v")) {
                contentConverter(sc);
                programRunning = true;
                noSelectedOption = false;
            } else if (response.equals("q")) {
                programRunning = false;
                noSelectedOption = false;
            } else {
                optionSelect(sc);
            }
        }

    }

    //Converts temperature based on line taken in by scanner
    //Parameter stringCheck: Takes in line to perform "CONVERT"
    public static void convert(Scanner stringCheck) {
        stringCheck.next();
        int temp = Integer.parseInt(stringCheck.next());
        String unit = stringCheck.next().toLowerCase();
        if (unit.equals("c")) {
            int f = (int) (1.8 * temp + 32);
            System.out.print(f + "F");
        } else if (unit.equals("f")) {
            int c = (int) ((temp - 32) / 1.8);
            System.out.print(c + "C");
        }
        System.out.println();
    }

    //Prints range, taking in start number, and end number, jumping by skip number
    //firstNumber - start
    //secondNumber - end
    //thirdNumber - jump
    //Parameter stringCheck: Takes in line to perform "RANGE" on
    public static void range(Scanner stringCheck) {
        stringCheck.next();
        int firstNumber = Integer.parseInt(stringCheck.next());
        int secondNumber = Integer.parseInt(stringCheck.next());
        int thirdNumber = Integer.parseInt(stringCheck.next());
        for (int i = firstNumber; i < secondNumber; i += thirdNumber) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Repeats string by specified number
    //Parameter stringCheck: Takes in line to perform "REPEAT" on
    public static void repeat(Scanner stringCheck) {
        stringCheck.next();
        while (stringCheck.hasNext()) {
            String temp = stringCheck.next();
            String repeated = temp.replace("_", " ").substring(1, temp.length() - 1);
            int repeatNum = Integer.parseInt(stringCheck.next());
            for (int i = 0; i < repeatNum; i++) {
                System.out.print(repeated);
            }
        }
        System.out.println();
    }

    //Prints content based on whether consoleOutput is on. 
    //consoleOutput is activated when the command is set to "V", and to a specified file if "I"
    //Parameter sc: processes through lines until no more lines
    public static void contentConverter(Scanner sc) throws FileNotFoundException {
        System.out.println("input file name?");
        String inputFile = sc.nextLine();
        Scanner input = new Scanner(new File("..\\UWLabs\\YazInterpreterUWLab_Folder\\" + inputFile));

        if(!consoleOutput) {
            System.out.println("output file name?");
            String outputFile = sc.nextLine();
            PrintStream output = new PrintStream(new File("..\\UWLabs\\YazInterpreterUWLab_Folder\\" + outputFile));
            System.setOut(output);
        }
        
        while (input.hasNextLine()) {
            String currentLine = input.nextLine();
            Scanner stringCheck = new Scanner(currentLine);
            if (currentLine.substring(0, 7).equals("CONVERT"))
                convert(stringCheck);
            else if (currentLine.substring(0, 5).equals("RANGE"))
                range(stringCheck);
            else if (currentLine.substring(0, 6).equals("REPEAT")) 
                repeat(stringCheck);
        }
        System.setOut(console);
        consoleOutput = true;
    }

    public static void quit() {
        programRunning = false;
    }

}