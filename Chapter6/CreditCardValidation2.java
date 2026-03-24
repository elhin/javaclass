package Chapter6;

import java.util.Scanner;

public class CreditCardValidation2 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        long creditCardNumber = input.nextLong();
        boolean validated = isValid(creditCardNumber);

    /*testing */
        

        if (validated == true) 
            System.out.print("\n" + creditCardNumber+ " is valid.");
        else
            System.out.print("\n" + creditCardNumber + " is not valid.");
    }

    public static boolean isValid(long number){
        int x = getSize(number);
        boolean validity = false;
        if (x >= 13 && x <= 16){
            int totalSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
            System.out.println("total sum: " + totalSum);
            
            // next if to evaluate numbers
            if (prefixMatched(number, totalSum)){
                if (totalSum % 10 == 0)
                    validity = true;
                else
                    validity = false;
            }
        } 
        else
            validity = false;

        return validity;
    }

    public static int sumOfDoubleEvenPlace(long number){
        System.out.println(number);
        String sNumber = Long.toString(number);
        int value = 0;
        int i = 0;

        for (i = 0; i < sNumber.length(); i += 2){
            int y = sNumber.charAt(i) - 48;
            //System.out.println("y is " + y);
            y = y * 2;
            //System.out.println("y times two is " + y);
            y = getDigit(y);
            value = value + y;
            //System.out.println("current value is " + value);
        }

        return value;
        //get the result from step 2
        //ie add all the single digit numbers
    }

    public static int getDigit(int number){
        int n1 = 0;
        if (number < 10) {
            //System.out.println("one digit");
            return number;
        }
        else {
            //System.out.println("two digits");
            n1 = number % 10;
            int n2 = number / 10;
            number = (n1 * 1) + (n2 * 1);
            return number;
            }
        //Return this number if it is a single digit
        //otherwise return the sum of the two digits
    }

    public static int sumOfOddPlace(long number){
        //System.out.println(number);
        String sNumber = Long.toString(number);
        int value = 0;
        int i = 1;
        for (i = 1; i < sNumber.length(); i+=2){
            int y = sNumber.charAt(i) - 48;
            //System.out.println("y is " + y);
            value = value + y;
            //System.out.println("current value is " + value);
        }
        return value;
        //return sum of odd place digits in a number
    }

    public static boolean prefixMatched(long number, int d){
        String sNumber = Long.toString(number);
        boolean validity = false;
        int y = sNumber.charAt(0) - 48;
        //System.out.println(y);
        if (y == 4)
            validity = true;
        else if (y == 5)
            validity = true;
        else if (y == 6)
            validity = true;
        else if (y == 3)
            if (sNumber.charAt(1) - 48 == 7)
                validity = true;
        else
            validity = false;

        //System.out.println("this card is " + validity);
        return validity;
        //return true if the number d is the prefix for the number
    }

    public static int getSize(long d){
        String sD = Long.toString(d);

        int sDLength = sD.length(); 
        return sDLength;
    }

}


