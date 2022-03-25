package SpaceNeedleUWLab;

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