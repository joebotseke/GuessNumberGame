import java.util.Random;
import java.util.Scanner;

/**
 * @author  Joe Botseke
  */

public class Game {

    public void randomGame () {

        // The welcome message
        System.out.println("Welcome to the RandomGame ! ");

        // User's name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your firstname : ");
        String firstName = scanner.next();
        System.out.println("Hello " + firstName);

        // start the game or not
        System.out.println("Start the game: y/Y or n/N");

        String start = scanner.next();

        if (start.equals("y") || start.equals("Y")) {
            Random random = new Random();
            int number = random.nextInt(100) + 1;

            int i = 0;
            int userNumber;
            while (i < 6) {
                System.out.println("Guess the number");
                userNumber = scanner.nextInt();

                if (userNumber < number) {
                    System.out.println("The number is bigger than " + userNumber);
                } else if (userNumber == number) {
                    System.out.println("Good job !");
                    System.out.println("Do you want to play again ? : Y/y or N/n");
                    String iWantAgain = scanner.next();
                    if (iWantAgain.equals("y") || iWantAgain.equals("Y")){
                        randomGame();
                    }
                    else {
                        System.out.println("See you soon " + firstName);
                        break;
                    }
                    break;
                } else {
                    System.out.println("The number is less than " + userNumber);
                }
                i++;
                if (i >= 5 && userNumber != number) {
                    System.out.println("RandomGame Over :(");
                    System.out.println("The number was : " + number);

                    System.out.println("Do you want to play again ? : Y/y or N/n");
                    String again = scanner.next();
                    if (again.equals("y") || again.equals("Y")){
                        randomGame();
                    }
                    else {
                        System.out.println("See you soon " + firstName);
                        break;
                    }
                }
            }
        } else {
            System.out.println("Okay :( Goodbye !");
        }
    }
}

// CODE PRO
/*import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner scanner;
    private Random random;
    private int maxAttempts;

    public Game() {
        scanner = new Scanner(System.in);
        random = new Random();
        maxAttempts = 6;
    }

    public void start() {
        displayWelcomeMessage();
        String firstName = askUserName();
        boolean playAgain = true;

        while (playAgain) {
            playOneGame(firstName);
            playAgain = askToPlayAgain();
        }

        displayGoodbyeMessage(firstName);
    }

    private void displayWelcomeMessage() {
        System.out.println("Welcome to the RandomGame!");
    }

    private String askUserName() {
        System.out.println("Type your firstname:");
        return scanner.next();
    }

    private void playOneGame(String firstName) {
        System.out.println("Let's start a new game!");
        int numberToGuess = random.nextInt(100) + 1;
        int attemptsLeft = maxAttempts;

        while (attemptsLeft > 0) {
            System.out.println("Guess the number (between 1 and 100):");
            int userGuess = scanner.nextInt();
            attemptsLeft--;

            if (userGuess == numberToGuess) {
                System.out.println("Good job, " + firstName + "!");
                return;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Attempts left: " + attemptsLeft);
            } else {
                System.out.println("Too high! Attempts left: " + attemptsLeft);
            }
        }

        System.out.println("You have no more attempts! The number was: " + numberToGuess);
    }

    private boolean askToPlayAgain() {
        System.out.println("Do you want to play again? (Y/N)");
        String answer = scanner.next().toUpperCase();
        return answer.equals("Y");
    }

    private void displayGoodbyeMessage(String firstName) {
        System.out.println("Goodbye " + firstName + ", thanks for playing!");
    }

}
*/
