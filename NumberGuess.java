
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;

        Random rand = new Random();
        int randomNumber = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;

        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound + ".");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the correct number.");
        System.out.println("It took you " + attempts + " attempts to guess the number.");
        
        scanner.close();
        System.out.println("\nGo Hatters!!");
        System.out.println("Program by: Naya Adla");
    }
}
