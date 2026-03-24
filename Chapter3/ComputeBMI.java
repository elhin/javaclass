package Chapter3;

import java.util.Scanner;

public class ComputeBMI{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //collect input
        System.out.print("Enter weight in pounds: ");
        int weight = input.nextInt();
        System.out.println(" ");
        System.out.print("Enter height in inches: ");
        int height = input.nextInt();

        //convert to metric
        double weightInKilos = (weight * 0.4535927);
        double heightInMeters = (height * 0.0254);

        //calculate BMI
        double BMI = (weightInKilos / (heightInMeters * heightInMeters));

        //show category

        if (BMI < 18.5) {
            System.out.println("Your BMI of " + BMI + " indicates that you are underweight.");
        }
            else if (BMI < 25.0) {
                System.out.println("Your BMI of " + BMI + " indicates that you are normal weight.");
            }
                else if (BMI < 30.0){
                    System.out.println("Your BMI of " + BMI + " indicates that you are overweight.");
                }
                else {
                    System.out.println("Your BMI of " + BMI + " indicates that you are obese.");
                }
    }
}