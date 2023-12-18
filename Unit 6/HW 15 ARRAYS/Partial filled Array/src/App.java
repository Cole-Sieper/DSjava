// Cole Sieper
// 12/18/23
// HW 15 Part A
// 

import java.util.Arrays;
import java.util.Scanner;

import javax.management.ValueExp;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        int[] VALUES = new int[10];

        
        // variables for trcking pos ition in array and loops

        int i = 0;
        int currentSize = 0;

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

                //convert string to an integer

                int input_num = Integer.valueOf(input);

                // Save the integer to a the array

                VALUES[i] = input_num;
                currentSize = currentSize + 1;
                i = i +1;

                if (i == VALUES.length) {
                System.out.println("Array is full. ");

                    break;
                }

            }
        }

        // sort and print the output

        Arrays.sort(VALUES);
        

        for (i = 0; i < currentSize; i++) {

            int j = VALUES.length - i - 1;
            
                System.out.print("*");
                System.out.print(VALUES[j]);

        }
        
        System.out.print("*");
        



    }
}
