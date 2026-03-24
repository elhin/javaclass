
import java.util.Scanner;
import java.util.ArrayList;

public class help {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> coolArray = new ArrayList<>();
        coolArray.add(32);
        coolArray.add(21);
        coolArray.add(98);
        coolArray.add(87);

        for (int i : coolArray) {
            System.out.println(i);
        }

        System.out.println("Enter a number: ");
        int numberEntered = input.nextInt();
        coolArray.add(numberEntered);
        
        for (int i : coolArray) {
            System.out.println(i);
        }

        for (int i = 0; i < numberEntered.length(); i++){

        }
    }
}
/** 
    public static ArrayList<Integer> splitViaString(long number){
        ArrayList<Integer> result = new ArrayList<>();
        String s = Long.toString(number);
        for(int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i) - 0);
        }

        for(int i : result)
            System.out.println(i);
        return result;
    }
}*/
