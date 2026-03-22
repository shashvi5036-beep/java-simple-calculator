import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int guess;

        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! 🎉");
                break;
            }
        }
    }
}
