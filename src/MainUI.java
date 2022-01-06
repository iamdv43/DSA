import problemStmt.ZigzagConversion;

import java.util.Scanner;

public class MainUI {

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("List of solved problems: ");
        System.out.println("ZigzagConversion \n");
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

            }
            System.out.println("Enter problem name OR Quit");
            userInput = myObj.next();
        }



    }

}
