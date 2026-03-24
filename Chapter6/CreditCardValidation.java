package Chapter6;

import java.util.Scanner;
import java.util.ArrayList;

public class CreditCardValidation {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        long creditCardNumber = input.nextLong();
        boolean validated = false;
        validated = isValid(creditCardNumber);

        if (validated = true) 
            System.out.print("\n" + creditCardNumber+ " is valid.");
        else
            System.out.print("\n" + creditCardNumber + "is not valid.");
    }

    public static boolean isValid(long number){
        //Return true if card number is valid
        int i = 0;
        String numberS = Long.toString(number);

        for (i = 0; i < (numberS.length()); i++){
            System.out.print(numberS.charAt(i) + "  ");
        }
        System.out.print("\n");

        int sumDoubleEven = sumOfDoubleEvenPlace(number);
        System.out.println(sumDoubleEven);
        int sumDoubleOdd = sumOfOddPlace(number);
        System.out.println(sumDoubleOdd);
        int sumBoth = sumDoubleEven + sumDoubleOdd;

        if (sumBoth % 10 == 0)
            return true;
        else
            return false;
        
    }

    public static int sumOfDoubleEvenPlace(long number){
        ArrayList<Integer> ccNumber = new ArrayList<>();
        int i = 0;
        String numberS = Long.toString(number);
        
        System.out.println("You are in the double even function");

        for (i = 0; i < numberS.length(); i++){
            System.out.println(numberS.charAt(i));
            int iterator = numberS.charAt(i) + 0;
            ccNumber.add(iterator);
            System.out.print(ccNumber.get(i));
        }

        i = 0;
        int doubleNumber = 0;
        int numberToAdd = 0;
        int doubled = 0;

        for (int it : ccNumber){
            System.out.print("current number is " + it);
            doubleNumber = it * 2;
            System.out.println(" times two is " + doubleNumber);
            numberToAdd = getDigit(doubleNumber);
            doubled = numberToAdd + doubled;
            System.out.println("current sum is " + doubled);
        }

        /* String numberS = Long.toString(number);
        int pleaseInteger = 0;
        for (i = 0; i < numberS.length(); i +=2){
            System.out.println("current character: " + numberS.charAt(i));
            pleaseInteger = numberS.charAt(i);
            doubleNumber = pleaseInteger * 2;
            System.out.println(numberS.charAt(i) + " x 2 is " + doubleNumber);
            
            
        } **/

        return doubled;
        //get the result from step 2
        //ie add all the single digit numbers
    }

    public static int getDigit(int number){
        if (number > 9){
            System.out.println(number + " is two digits");
            int n1 = number % 10;
            int n2 = number / 10;
            number = (n1 * 1) + (n2 * 1);
            return number;
        }
        else
            System.out.println(number + " is one digit");
            return number;

        //Return this number if it is a single digit
        //otherwise return the sum of the two digits
    }

    public static int sumOfOddPlace(long number){
        String numberS = Long.toString(number);
        int i = 1;
        int added = 0;
        for (i = 1; i < numberS.length(); i +=2){
            added = added + numberS.charAt(i);
        }
        return added;
        //return sum of odd place digits in a number
    }

    public static boolean prefixMatched(long number, int d){
        //return true if the number d is the prefix for the number
        return true;
    }

    public static int getSize(long d){
        //return the number of digits in d
        return 1;
    }

    public static long getPrefix(long number, int k){
        //return the first k number of digits from number
        //If the number of digits is less than k, return number
        return 1;
    }
}
