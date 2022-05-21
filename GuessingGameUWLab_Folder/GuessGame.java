//Victor Wong
//March 19th, 2022
//CSE142
//TA: TA Name
//Take-Home Assessment #5
//
//This program is intended to simulate a guessing number game
//a number is chosen from 1-100, and high/low helps the player figure out
//the answer. Results are stored in this program.
package UWLabs.GuessingGameUWLab_Folder;
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

    //Prints the "intro" message haiku
    public static void printHaiku() {
        System.out.println("The number is right");
        System.out.println("I'll tell you higher or lower");
        System.out.println("How many guesses?");
        System.out.println();
    }

    //Performs the action of the game, making a random number and testing the guess
    //Parameter sc: allows this method to intake information from the terminal
    //Parameter rand: generates a random number
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

    //generates a random number
    //Parameter rand: generates a random number
    public static void makeRandomNumber(Random rand) {
        randomNumber = rand.nextInt(100) + 1;
    }

    //Used if the guess is higher than the guess
    public static void higher() {
        currentGameGuesses++;
        System.out.println("It's higher.");
    }

    //Method used if the guess is higher than the guess
    public static void lower() {
        currentGameGuesses++;
        System.out.println("It's lower.");
    }

    //Method tests the guess, taking it in until the game is finished
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

    //Method asks if the player would like to play again
    //Two options: Continue or Exit
    //Parameter sc: allows this method to intake information from the terminal
    //Parameter rand: generates a random number
    public static void playAgain(Scanner sc, Random rand) {
        System.out.println("Would you like to play again? ");
        String response = sc.next();
        if(response.startsWith("y")) {
            performGame(sc, rand);
        }
    }

    //Displays collected results in format
    //Parameter fmt: allows this method to format the decimals in such fashion of 0.##.
    public static void displayResults(DecimalFormat fmt) {
        System.out.println("Overall results: ");
        System.out.println("Total games = " + totalGames);
        System.out.println("Guess/game = " + fmt.format((double) totalGuesses / (double) totalGames));
        System.out.println("Best game: " + bestGame);
    }

}
