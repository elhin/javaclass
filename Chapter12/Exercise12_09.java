package Chapter12;

import java.util.Scanner;
//implements the bin2Dec method to throw a 
// BinaryFormatException if the string is 
// not a binary string. Define a custom 
// exception called BinaryFormatException. 
// Implement the bin2Dec method to throw a 
// BinaryFormatException if the string is 
// not a binary string.
public class Exercise12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String bin = input.nextLine();
        int dec = 0;
        try {
            dec = bin2Dec(bin);
            System.out.print("The decimal value for binary number " + bin + " is " + dec);

        }
        catch (BinaryFormatException ex) {
            System.out.println("Number needs to be binary");
        }  
    }

    public static int bin2Dec(String bin) {
       int decimalValue = 0;
       for(int i = 0; i < bin.length(); i++){
        char binChar = bin.charAt(i);
        decimalValue = decimalValue * 2 + binCharToDecimal(binChar);
       }
        return decimalValue;
    }

    public static int binCharToDecimal(char ch){
        if (ch != '1' && ch != '0'){
            throw new BinaryFormatException();
        }
        else {
            if (ch == '1'){
                return 1;
            }
            else{
                return 0;
            }
        }

    }




}
