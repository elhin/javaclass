package Chapter3;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args){
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        //if number 1 < number 2, swap
        if (number1 < number2) {
            int temp = number2;
            number2 = number1;
            number1 = temp;
        }

        //create a scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " - " + number2 + "? ");

        int answer = input.nextInt();

        if (number1 - number2 == answer){
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}
