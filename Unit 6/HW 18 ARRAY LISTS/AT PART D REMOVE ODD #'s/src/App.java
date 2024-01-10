// Cole SIeper
// 1/10/24
// HW 18 Part D

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);


        ArrayList<Integer> list = new ArrayList<Integer>();


        // input loop

        // input loop

        System.out.println ("--- Enter 'q' to end input ---");

        while (true) 
        {

            String input = "";

            
            System.out.print("Plese enter a integer: ");
            input = in.nextLine();

            if (input.charAt(0)== 'q' || input.charAt(0)=='Q') {

                System.out.println("Done entering inputs. ");

                break;

            } else {

                //convert string to an double

                int input_num = Integer.valueOf(input);

                // Save the integer to a the array

                list.add(input_num);
            
                
                }

            }


            // loop to take out odd numbers

            for (int i = 0; i < list.size(); i++) {

                int num = list.get(i);

                if (num % 2 == 1) {

                    list.remove(i);

                    i = i - 1;

                } 

            }

            

            // --- Output Loop ---

            System.out.println("All the odd numbers have been removed: ");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));

                }














    }

}

