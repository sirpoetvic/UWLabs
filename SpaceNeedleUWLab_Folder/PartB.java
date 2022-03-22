package SpaceNeedleUWLab;

public class PartB {
    public static void main(String[] args) {
        part1();
        part2();
    }

    public static void part1() {
        for(int i = 0; i < 4; i++) {
            System.out.print("            ||");
            if(i < 3) {
                System.out.println();
            }
        }
    }

    public static void part2() {
        int counter = 0;
        for(int i = 4; i > 1; i--) {
            System.out.println();
            counter++;
            for(int j = 0; j < (i - 1) * 3; j++) {
                System.out.print(" ");
            }

            System.out.print("__/");

            for(int k = 0; k < (counter - 1) * 3; k++) {
                System.out.print(":");
            }

            System.out.print("||");
        }
    }

    public static void part3() {

    }

    public static void part4() {

    }

    public static void part5() {

    }
}
