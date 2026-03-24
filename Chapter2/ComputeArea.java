package Chapter2;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       

        //Step 1 read in radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Step 2 compute area
        double area = radius * radius * 3.14159;

        //Step 3 display the area
        System.out.println("The area for the circle of radius " + radius + " is " + area);

        input.close();
    }

}
