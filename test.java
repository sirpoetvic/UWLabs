public class test {
    public static void main(String[] args) {
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
}
