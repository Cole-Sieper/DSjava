// Cole Sieper
// 1/10/24
// HW 18 Part A

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);


        ArrayList<String> names = new ArrayList<String>();


        // input loop

        System.out.println ("--- Enter '#' to end input ---");

        while (true) 
        {

            String input = "";

            
            System.out.print("Plese enter a name: ");
            input = in.nextLine();



            if (input.charAt(0)== '#' ) {
                System.out.println("Done entering names. ");

                break;

            } else {
                names.add(input);
            }

                }


                // Output Loop

            for (int i = 0; i < names.size(); i++) {

                String currentName = names.get(i);

                System.out.println(currentName);
            


            }


            



    }
 
}
