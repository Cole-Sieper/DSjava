// Cole Sieper
// 12/18/23
// HW 15 part B
// Count Array

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);


        int currentSize = 0;
        int i = 0;

        int[] VALUES = new int[20];


        while (true) 
        {

            String input = "";

            
            System.out.print("Plese enter a integer or 'q' to quit: ");
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


            for (i=0; i < currentSize+1; i++) {

                System.err.print(VALUES[i]+",");

            }


        // count a nuber in the array

        int count_num = 0;

        System.out.print("Please enter a integer to count: ");
        count_num = in.nextInt();


        int count = 0;

        for (i = 0; i < VALUES.length; i++) {

            

            if (VALUES[i] == count_num) {

                count = count + 1;
            }

        }



        //OUTPUTS THE VALUES


        System.out.println();

        if (count == 1) {

            System.out.println("The number "+count_num+" occured "+count+" time!");

        } else {

            System.out.println("The number "+count_num+" occured "+count+" times!");

        }




    }
}
