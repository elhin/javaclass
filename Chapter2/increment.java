package Chapter2;

import java.util.Scanner;

public class increment {
        public static void main(String[] args){
            int i = 3, j = 3;
            i++;
            j--;
            System.out.println("The sum of " + i + " and " + j  + " is ");
            System.out.println(j + i);
            System.out.println((int)1.7);
            Scanner input = new Scanner(System.in);

            System.out.print("Enter purchase amount: ");
            double purchaseAmount = input.nextDouble();

            double tax = purchaseAmount * 0.06;
            System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);
        }
}
