// Cole Sieper
// 1/6/24
// HW 16 Part A
// 

import java.util.Arrays;
import java.util.Scanner;

import javax.management.ValueExp;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        double[] VALUES = new double[10];

        
        // variables for trcking pos ition in array and loops

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

                //convert string to an integer

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

            // Print the scores

            System.out.println("Entered Quiz Scores: ");

            for (i = 0; i < VALUES.length; i++ ) {

                
                System.out.print(VALUES[i]+" | ");
                
                

            }

            System.out.println();

            // ask if drop

            String drop = "";

            System.out.print(" Would you like to drop the lowest score? (y/n): ");
            drop = in.nextLine();

            if (drop.charAt(0) == 'y') {

                double dropScore;

                System.out.println("Please confirme the score: ");
                dropScore = in.nextDouble();

                dropLowestScore(VALUES, dropScore);

            }


    }


    public static void dropLowestScore(double[] scores, double scoreToDrop) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == scoreToDrop) {
                for (int j = i; j < scores.length - 1; j++) {
                    scores[j] = scores[j + 1];
                }
                scores[scores.length - 1] = 0;
                break; 
        }
    }

        System.out.println("New Quiz Scores: ");

            for (int i = 0; i < scores.length; i++ ) {

                
                System.out.print(scores[i]+" | ");
                
                

            }
        
}

}
