package Chapter2;

import java.util.Scanner;

public class moneyconvert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter amount of money to be converted in dollars and cents, eg 15.45:  ");
        double moneyToConvert = input.nextDouble();

        int remainingAmount = (int)(moneyToConvert * 100);

        // find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //find the number of quarters
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        //find the number of dimes
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        //find the number of nickels
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        System.out.print("You would have " + numberOfOneDollars + " dollar bills, ");
        System.out.print(numberOfQuarters + " quarters, ");
        System.out.print(numberOfDimes + " dimes, ");
        System.out.print(numberOfNickels + " nickels, ");
        System.out.print("and " + remainingAmount + " pennies.");
    }
}
