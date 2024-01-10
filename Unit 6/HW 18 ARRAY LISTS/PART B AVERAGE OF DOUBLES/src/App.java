// Cole Sieper
// 1/10/24
// HW 18 Par B

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);


        ArrayList<Double> list = new ArrayList<Double>();


        // input loop

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

                list.add(input_num);
            
                
                }

            }


                
        

                // First Output Loop

            for (int i = 0; i < list.size(); i++) {

                double currentNum = list.get(i);

                System.out.printf("%.2f%n", currentNum);
            


            }


            // Average of vales

            System.out.println("The average of the entered values: ");

            double sum = 0;
            double average = 0;

            for (int i = 0; i < list.size(); i++) {

                sum = sum + list.get(i);

            }

            average = sum / (list.size() - 1);


            
            System.out.println(average);

            



    }
}
 
