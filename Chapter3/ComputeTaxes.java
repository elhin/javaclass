package Chapter3;

import java.util.Scanner;

public class ComputeTaxes {
    public static void main(String[] args){
    //get filers marriage status
    System.out.println("Marital status codes.");
    System.out.println("If single, type 0. If married filing jointly or qualified widow(er), type 1. If married filing separately, type 2. If head of househod, type 3.");
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter marital status: ");
    int maritalStatus = input.nextInt();

    System.out.print("Enter annual income: ");
    double income = input.nextDouble();

    double tax = 0;

    if (maritalStatus == 0){
        if (income < 8350);
            tax = income * .10;
        else if(income < 33950);{
            tax = 8350 * 0.10 + (income - 8350) * 0.15;
        }
    }
    else if (maritalStatus == 1){

    }
    else if (maritalStatus == 2){

    }
    else if(maritalStatus == 3){

    }
    else{
        System.out.println("Error. Status invalid.");
    }
    }
}
