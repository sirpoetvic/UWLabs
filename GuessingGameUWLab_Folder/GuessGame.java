//Make a method that takes in the random number that is generated in main
//and you can keep using the testGuess method to check (take the gues as a parameter along with the generated num)

package GuessingGameUWLab_Folder;
import java.util.Scanner;
import java.util.Random;
public class GuessGame {
    public static int randomNumber;
    public static int totalGuesses;
    public static int currentGameGuesses;
    public static boolean gameNotComplete = true;
    public static int totalGames;
    public static boolean notComplete = true;
    public static int bestGame = 1000001;
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        printHaiku();
        randomNumber = rand.nextInt(100) + 1;
        while(notComplete) {
        startGame();
        while(gameNotComplete) {
            System.out.print("Your guess? ");
            int response = sc.nextInt();
            testGuess(response);
        }
        if(bestGame > currentGameGuesses) {
            bestGame = currentGameGuesses;
        }
        totalGames++;

        System.out.println("Would you like to play again?");
        String response = sc.nextLine();
        if(!(response.startsWith("y"))) {
            displayResults();
            break;
        }
        randomNumber = rand.nextInt(100) + 1;
        }
    }

    public static void printHaiku() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void startGame() {
        gameNotComplete = true;
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
            gameNotComplete = false;
            totalGuesses += currentGameGuesses;
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

    public static void displayResults() {
        System.out.println("Overall results = ");
        System.out.println("Total games = " + totalGames);
        System.out.println("Guess/game = " + (double) totalGuesses / (double) totalGames);
        System.out.println("Best game: " + bestGame);
    }
}