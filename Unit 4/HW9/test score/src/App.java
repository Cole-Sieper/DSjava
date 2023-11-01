// Cole Sieper
// 11/1/23
// HW 9 Part A

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

            //directions for the user
            System.out.println("----- Input test scores to average ----- Input -1 to finalize -----");
        

            //initialized all o fthe variables
            double input = 0;
            double total_score = 0;
			int count = 0;
            double average_score = 0; 
        

            //loop to continute ntil negative is enetered
			while (input >= 0)
			{
                count++;
                System.out.print(count+" | Input a test score (ie. 94.2): ");
			    input = in.nextDouble();

                //if the inout was negitive it subtracts to the last coutn and calulates the average then prints it
                if (input < 0) 
			{ 
                count = count -1;
			    average_score = total_score / count; 
                System.out.printf("Your average score from your "+count+" tests was: %02.1f",average_score);
			} else //else it continues the loop

			    total_score = total_score + input; 
			   
			}
			

    }
}
