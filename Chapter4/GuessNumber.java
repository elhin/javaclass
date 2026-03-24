package Chapter4;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 100);
        
        System.out.println("The number is " + number1);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100:\n");

        int guess = -1;
        while (guess != number1) {
            System.out.println("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number1)
                System.out.println("Yes, the number is " + number1);
            else if (guess < number1)
                System.out.println("Your guess is too low!");
            else
                System.out.println("Your guess is too high!");
        }
    }
}
