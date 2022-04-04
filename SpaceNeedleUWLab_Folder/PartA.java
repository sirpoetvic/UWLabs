//Victor Wong
//April 4th, 2022
//CSE142
//TA: TA Name
//Take-Home Assessment #2, Part A
//
//This program is intended to print out a pyramid with a star
//in the top left corner
package SpaceNeedleUWLab_Folder;
public class PartA {
    public static void main(String[] args) {
        pyramid();
    }

        //Generates a pyramid
        public static void pyramid() {
            //used to invert right triangle horizontally 
            int counter = 0;

            for(int i = 10; i > 0; i--) {
                counter++;

                System.out.print("*");
                System.out.println();
                
                for(int k = counter; k < 10; k++) {
                    System.out.print(" ");
                }

                for(int k = i; k < 10; k++) {
                    System.out.print("/-");
                }

                for(int k = i; k < 10; k++) {
                    System.out.print("*");
                }
                
                
            }
        }
}