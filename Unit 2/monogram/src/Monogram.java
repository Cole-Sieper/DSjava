//Cole Sieper
//10/1/23

import java.util.Scanner; 

public class Monogram {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        //name variable innitialization
        String fn = "f"; // first name 
        String mn = "m"; // middle name
        String ln = "l"; // last name
        

        //inputs
        
        System.out.print("First Name: ");
        fn = in.nextLine();
        System.out.print("Middle Name: ");
        mn = in.nextLine();
        System.out.print("Last Name: ");
        ln = in.nextLine();

       
        // taking the first letter of each

        String fi = fn.substring(0, 1); //taking first letter of first name
        String mi = mn.substring(0, 1); // taking first letter of middle name
        String li = ln.substring(0, 1); // taking first letter of last name

        String Monogram = fi+mi+li;

        //Output
        System.out.println("-----Outputs-----");
        System.out.println("Here is your Monogram: "+ Monogram); // compiling the letters


    }
}
