import problemStmt.TwoSum;
import problemStmt.ZigzagConversion;

import java.util.Scanner;

public class MainUI {

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("List of solved problems: ");
        System.out.println("ZigzagConversion \nTwoSum");
        System.out.println("Enter problem name: ");

        String userInput = myObj.next();

        while(!userInput.equalsIgnoreCase("quit")){
            if(userInput.equalsIgnoreCase("ZigzagConversion")){
                System.out.println("Enter string: ");
                String s = myObj.next();
                System.out.println("Enter rows: ");
                int numRows = myObj.nextInt();

                ZigzagConversion zC = new ZigzagConversion(s, numRows);
                zC.solve();

            }else if(userInput.equalsIgnoreCase("TwoSum")){
                System.out.println("{1, 2, 3, 4, 5, 6, 7, 8, 9}");
                System.out.println("Enter target number: ");
                int target = myObj.nextInt();
                TwoSum twoSum = new TwoSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, target );

                twoSum.solve();
            }

            System.out.println("Enter problem name OR Quit");
            userInput = myObj.next();
        }



    }

}
