//Number Guessing Game
import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("---Number Guessing Game---");

        // Generate random number between 1 and 10
        int randomNumber = r.nextInt(10) + 1;
        
        //System.out.println("Random Number" + randomNumber);

        int guessNumber;
        System.out.println("Guess a number between 1 and 10");

        do {
            System.out.print("Enter a number: ");
            guessNumber = sc.nextInt();

            if (guessNumber > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (guessNumber < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! The number was: " + randomNumber);
            }
        } while (guessNumber != randomNumber);

        System.out.println("You won!");
        sc.close();
    }

}
