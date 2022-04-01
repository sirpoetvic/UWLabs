package GuessingGameUWLab_Folder;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class GuessGame {
    public static int randomNumber;
    public static int totalGuesses;
    public static int currentGameGuesses;
    public static boolean gameNotComplete = true;
    public static int totalGames;
    public static boolean notComplete = true;
    public static int bestGame = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        DecimalFormat fmt = new DecimalFormat("0.##");
        printHaiku();
        performGame(sc, rand);
        displayResults(fmt);
        
    }

    public static void printHaiku() {
        System.out.println("The number is right");
        System.out.println("I'll tell you higher or lower");
        System.out.println("How many guesses?");
        System.out.println();
    }

    public static void performGame(Scanner sc, Random rand) {
        totalGames++;
        gameNotComplete = true;
        System.out.println("I'm thinking of a number between 1 and 100...");
        makeRandomNumber(rand);
        while(gameNotComplete) {
            System.out.println("Your guess?");
            int guess = Integer.parseInt(sc.next());
            testGuess(guess);
        }
        playAgain(sc, rand);
    }

    public static void makeRandomNumber(Random rand) {
        randomNumber = rand.nextInt(100) + 1;
    }

    public static void higher() {
        currentGameGuesses++;
        System.out.println("It's higher.");
    }

    public static void lower() {
        currentGameGuesses++;
        System.out.println("It's lower.");
    }

    public static void testGuess(int x) {
        if(x == randomNumber) {
            currentGameGuesses++;
            System.out.println("You got it right in " + currentGameGuesses + " guesses!");
            gameNotComplete = false;
            if(currentGameGuesses < bestGame) {
                bestGame = currentGameGuesses;
            }
            totalGuesses += currentGameGuesses;
            currentGameGuesses = 0;
        }
        else if(x < randomNumber) {
            higher();
            //gameNotComplete is still true
        }
        else if(x > randomNumber) {
            lower();
            //gameNotComplete is still true
        }
    }

    public static void playAgain(Scanner sc, Random rand) {
        System.out.println("Would you like to play again? ");
        String response = sc.next();
        if(response.startsWith("y")) {
            performGame(sc, rand);
        }
    }

    public static void displayResults(DecimalFormat fmt) {
        System.out.println("Overall results: ");
        System.out.println("Total games = " + totalGames);
        System.out.println("Guess/game = " + fmt.format((double) totalGuesses / (double) totalGames));
        System.out.println("Best game: " + bestGame);
    }



}
