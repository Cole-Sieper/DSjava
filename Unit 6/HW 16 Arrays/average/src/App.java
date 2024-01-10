// Cole Sieper
// 1/6/24
// HW 16 Part B

import java.util.Scanner;
import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);


        // variables for trcking pos ition in array and loops

        double[] VALUES = new double[10];

        int i = 0;
        int currentSize = 0;




        // input loop

        System.out.println ("--- Enter 'q' to end input ---");

        while (true) 
        {

            String input = "";

            
            System.out.print("Plese enter a double: ");
            input = in.nextLine();

            if (input.charAt(0)== 'q' || input.charAt(0)=='Q') {
                System.out.println("Done entering inputs. ");

                break;

            } else {

                //convert string to an double

                double input_num = Double.parseDouble(input);

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

        

        // OUTPUT

        System.out.println("The average of the values is: " + average(VALUES, currentSize));



    }


    public static double average(double[] average, int arraySize) {

        double total = 0;
        double averageNum;

        for (int i = 0; i < average.length; i++) {

            
            total = total + average[i];
            

        }

        // get average

        averageNum = total / arraySize;

        return averageNum;

    }



}
