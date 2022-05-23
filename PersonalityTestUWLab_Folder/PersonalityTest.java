//Victor Wong 
//April 20th, 2022
//CSE142
//TA: TA Name
//Take-Home Assessment #7
//
//This program is intended to intake a file
//of data for the Keirsey Temperament Sorter
//and return a personality of 4 letters.
package PersonalityTestUWLab_Folder;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.io.PrintStream;

public class PersonalityTest {
    public static void main(String[] args) throws FileNotFoundException {
        printIntro();
        Scanner sc = new Scanner(System.in);
        System.out.println("input file name?");
        String inputFile = sc.nextLine();
        System.out.println("output file name?");
        String outputFile = sc.nextLine();
        Scanner input = new Scanner(new File("..\\UWLabs\\PersonalityTestUWLab_Folder\\" + inputFile));
        PrintStream output = new PrintStream(new File("..\\UWLabs\\PersonalityTestUWLab_Folder\\" + outputFile));
        computeResponses(input, output);
        sc.close(); 
        input.close();
        output.close(); 

    }
 
    public static void printIntro() {
        System.out.println("This program processes a file of answers to the");
        System.out.println("Keirsey Temperament Sorter. It converts the");
        System.out.println("various A and B answers for each person into");
        System.out.println("a sequence of B-percentages and then into a");
        System.out.println("four-letter personality type.");

    }

    public static void computeResponses(Scanner input, PrintStream output) {
        while (input.hasNextLine()) {
            String name = input.nextLine();
            String[] dataArray = input.nextLine().toLowerCase().split("");
            output.println(name + ": " + Arrays.toString(singleUser(name,dataArray)[2]) + " = " + determineType(singleUser(name, dataArray)));
        }
    }

    public static String determineType(int[][] organizedResults) {
        int[] tempPercentSet = organizedResults[2];

        String identification = "";

        if (tempPercentSet[0] < 50) {
            identification += "E";
        } else if (tempPercentSet[0] > 50) {
            identification += "I";
        } else if (tempPercentSet[0] == 50) {
            identification += "X";
        }

        if (tempPercentSet[1] < 50) {
            identification += "S";
        } else if (tempPercentSet[1] > 50) {
            identification += "N";
        } else if (tempPercentSet[1] == 50) {
            identification += "X";
        }
        
        if (tempPercentSet[2] < 50) {
            identification += "T";
        } else if (tempPercentSet[2] > 50) {
            identification += "F";
        } else if (tempPercentSet[2] == 50) {
            identification += "X";
        }
       
        if (tempPercentSet[3] < 50) {
            identification += "J";
        } else if (tempPercentSet[3] > 50) {
            identification += "P";
        } else if (tempPercentSet[3] == 50) {
            identification += "X";
        }
        
        return identification;

    }

    public static int[][] singleUser(String name, String[] dataArray) {
        // Introvert/Extrovert Data
        int extrovertA = 0;
        int introvertB = 0;
        // dashes are irrelevant to the ratio
        for (int i = 0; i < dataArray.length; i += 7) {
            if (dataArray[i].equals("a")) {
                extrovertA++;
            } else if (dataArray[i].equals("b")) {
                introvertB++;
            }
        }

        // Sensation/iNtuition Data
        int sensationA = 0;
        int iNtuitionB = 0;
        for (int i = 1; i < dataArray.length; i += 7) {
            if (dataArray[i].equals("a")) {
                sensationA++;
            } else if (dataArray[i].equals("b")) {
                iNtuitionB++;
            }
            if ((i + 1) < 70) {
                if (dataArray[i + 1].equals("a")) {
                    sensationA++;
                } else if (dataArray[i + 1].equals("b")) {
                    iNtuitionB++;
                }
            }
        }

        // Thinking/Feeling Data
        int thinkingA = 0;
        int feelingB = 0;
        for (int i = 3; i < dataArray.length; i += 7) {
            if (dataArray[i].equals("a")) {
                thinkingA++;
            } else if (dataArray[i].equals("b")) {
                feelingB++;
            }
            // check the one in front as well :D
            if ((i + 1) < 70) {
                if (dataArray[i + 1].equals("a")) {
                    thinkingA++;
                } else if (dataArray[i + 1].equals("b")) {
                    feelingB++;
                }
            }
        }

        // Judging/Percieving Data
        int judgingA = 0;
        int percievingB = 0;
        for (int i = 5; i < dataArray.length; i += 7) {
            if (dataArray[i].equals("a")) {
                judgingA++;
            } else if (dataArray[i].equals("b")) {
                percievingB++;
            }
            // check the one in front as well :D
            if ((i + 1) < 70) {
                if (dataArray[i + 1].equals("a")) {
                    judgingA++;
                } else if (dataArray[i + 1].equals("b")) {
                    percievingB++;
                }
            }
        }
        int IEpercent = (int) Math.round((introvertB / (double) (introvertB + extrovertA)) * 100);
        int SNpercent = (int) Math.round((iNtuitionB / (double) (iNtuitionB + sensationA)) * 100);
        int TFpercent = (int) Math.round((feelingB / (double) (feelingB + thinkingA)) * 100);
        int JPpercent = (int) Math.round((percievingB / (double) (percievingB + judgingA)) * 100);

        int[][] organizedResults = new int[][] { {extrovertA, sensationA, thinkingA, judgingA},
                                                 {introvertB, iNtuitionB, feelingB, percievingB}, 
                                                 {IEpercent, SNpercent, TFpercent, JPpercent}
                                                };
        return organizedResults;

    }
}
