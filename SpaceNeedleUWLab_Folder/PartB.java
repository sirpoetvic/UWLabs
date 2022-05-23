//Victor Wong
//April 4th, 2022
//CSE142
//TA: TA Name
//Take-Home Assessment #2, Part B
//
//This program is intended to print out the an 
//ASCII impression of the Space Needle
package SpaceNeedleUWLab_Folder;

public class PartB {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        needle();
        colon();
        quotes();
        doubleSlash();
        needle();
        middlePart();
        colon();
        quotes();
    }

    // prints the part with just ||
    public static void needle() {
        for (int i = 0; i < SIZE; i++) {
            // spacing
            for (int j = 0; j < (SIZE * 3); j++) {
                System.out.print(" ");
            }
            // middle
            System.out.println("||");
        }
    }

    // prints the part with colons and surrounding underscore and slash
    public static void colon() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = -6 + (SIZE * 3); j >= i * 3; j -= 3) {
                System.out.print("   ");
            }

            System.out.print("__/");

            for (int j = 1; j <= i; j++) {
                System.out.print(":::");
            }

            System.out.print("||");

            for (int j = 1; j <= i; j++) {
                System.out.print(":::");
            }

            System.out.println("\\__");

        }
    }

    // prints the part with quotation marks and the |
    public static void quotes() {
        System.out.print("|");
        for (int i = 0; i < (SIZE * 6); i++) {
            System.out.print("\"");
        }
        System.out.println("|");

    }

    // prints the part with back slash and forward slash
    public static void doubleSlash() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = i * 2; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for (int j = ((SIZE * 3) - 1) - (i * 2); j > 0; j--) {
                System.out.print("/\\");
            }
            System.out.println("_/");
        }
    }

    // prints the middle part with the percentage symbols
    public static void middlePart() {
        for (int i = 0; i < SIZE * 4; i++) {
            System.out.println("         |%%||%%|");
        }
    }
}
