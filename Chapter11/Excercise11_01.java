package Chapter11;

import java.util.Scanner;

public class Excercise11_01 {
    //*Write a test program that prompts the user to enter three 
    // sides of the triangle, a color, and 
    // a Boolean value to indicate whether the triangle is 
    // filled. The program should create a Triangle object
    //  with these sides and set the color and filled properties 
    // using the input. The program should display the area, 
    // perimeter, color, and true or false to indicate 
    // whether it is filled or not.
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("You will create a triangle ");
        System.out.print("Enter side 1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3: ");
        double side3 = input.nextDouble();

        input.nextLine();
        System.out.print("Enter filled status (true for filled, false for not filled): ");
        Boolean filled = input.nextBoolean();
        input.nextLine();
        System.out.print("Enter color: ");
        String color = input.nextLine();

        Triangle userTriangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println("If your triangle is impossible, the area will return as 0.");
        System.out.print("\nThe triangle's area is " + userTriangle.getArea());
        System.out.print("\nThe triangle's perimeter is " + userTriangle.getPerimeter());
        System.out.println("\nThe triangle's color is " + userTriangle.getColor() + " and the filled status is " + userTriangle.isFilled());
        }
    

}
