package Chapter78Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class IdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matrix1 = new int[3][3];
        int [][] matrix2 = new int[3][3];


        System.out.println("Enter m1 (a 3 by 3 matrix) row by row: ");
        for (int row = 0; row < matrix1.length; row++){
            for(int column = 0; column < matrix1[row].length; column++){
                matrix1[row][column] = input.nextInt();
            }
        }
        System.out.println("Enter m2 (a 3 by 3 matrix) row by row");
        for (int row = 0; row < matrix2.length; row++){
            for(int column = 0; column < matrix2[row].length; column++){
                matrix2[row][column] = input.nextInt();
            }
        }

        /**for (int row = 0; row < matrix1.length; row++){
            for(int column = 0; column < matrix1[row].length; column++){
                System.out.print(matrix1[row][column] + " ");
            }
            System.out.print("\n");
        }

        for (int row = 0; row < matrix2.length; row++){
            for(int column = 0; column < matrix2[row].length; column++){
                System.out.print(matrix2[row][column] + " ");
            }
            System.out.print("\n");
        }*/

        boolean matches = equals(matrix1, matrix2);
        //System.out.println("Value of matches " + matches);

        if (matches == true){
            System.out.println("m1 and m2 match.");
        }
        else {
            System.out.println("m1 and m2 do not match.");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2){
        boolean status = false;
        boolean testing = Arrays.deepEquals(m1, m2);
        //System.out.println("testing is " + testing);

        /** for (int row = 0; row < m1.length; row++){
            for (int column = 0; column < m1[row].length; column++){
                System.out.println("x");
                if (m1[row][column] == m2[row][column]){
                    status = true;
                    System.out.println(m1[row][column] + " and " + m2[row][column] + "match");
                }
                else
                    status = false;
                    System.out.println(m1[row][column] + " and " + m2[row][column] + "do not match");
                    break;
            }
        }*/
        //System.out.println(status);
        return testing;
    }
}
