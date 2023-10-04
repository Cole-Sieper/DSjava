//Cole Sieper
//9/25/23

import java.util.Scanner; //importing the scanner
public class phonenumber {
    
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in); 

        //initializing the variable
        String phonenumber = "0";

        //inputs from user
        System.out.print("Enter in a 10 digit phonenumber (NO SPACES ): ");
        phonenumber = in.nextLine();

        // taking certain parts of the numeber and spliting them up
        String area_code = phonenumber.substring(0,3);
        String first3 = phonenumber.substring(3, 6);
        String last4 = phonenumber.substring(6, 10);

        //outputs
        System.out.println("-----Outputs-----");
        System.out.println("Here is the formated number:");
        System.out.println("("+area_code+")"+" "+first3+"-"+last4);



    }
}