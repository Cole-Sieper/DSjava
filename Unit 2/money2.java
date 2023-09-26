// Cole Sieper
//9/25/23

import java.util.Scanner; //importing the scanner
public class money2 {
    
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in); 


        // asks for inputs
        System.out.print("Input your amount of money to format (max 99 dollars, max 99 cents): ");
        //initialies moeny variable and sets as input
        String money = in.nextLine();

        //breaks down the toatoal doarrar amoutn itnot the cetns and dolars variables seperately
        String dollars = money.substring(0,2);
        String cents = money.substring(3,5);

        //outputs
        System.out.println("-----Outputs-----");
        System.out.println("You have "+dollars+" Dollars");
        System.out.println("You have "+cents+" Cents");


    }
}