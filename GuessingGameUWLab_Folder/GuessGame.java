package GuessingGameUWLab_Folder;
import java.util.Scanner;
import java.util.Random;
public class GuessGame {
    public static int randomNumber;
    public static int totalGuesses;
    public static int currentGameGuesses;
    public static boolean gameComplete;
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        printHaiku();
        startGame();
        while(gameComplete == false) {
            System.out.print("Your guess? ");
            int response = sc.nextInt();
            testGuess(response);
        }

        System.out.println("Would you like to play again?");
        String response = sc.nextLine();
        if(response.startsWith("y")) {
            startGame();
        }
        else {
            displayResults();
        }


    }

    public static void printHaiku() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void startGame() {
        gameComplete = false;
        System.out.println("I'm thinking of a number between 1 and 100...");
    }

    public static void higher() {
        System.out.println("It's higher.");
        totalGuesses++;
    }

    public static void lower() {
        System.out.println("It's lower.");
        totalGuesses++;
    }

    public static void testGuess(int x) {
        if(x == randomNumber) {
            System.out.println("You got it right in " + currentGameGuesses + " guesses!");
            gameComplete = true;
            totalGuesses += currentGameGuesses;
        }
        else if(x < randomNumber) {
            higher();
            //gameComplete is still false
        }
        else if(x > randomNumber) {
            lower();
            //gameComplete is still false
        }
    }
        
    public static void produceNum() {
        randomNumber = rand.nextInt(100) + 1;
    }

    public static void displayResults() {

    }
}