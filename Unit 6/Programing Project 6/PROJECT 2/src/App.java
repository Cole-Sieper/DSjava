// Cole Sieper
// 1/16/24
// PROJECT 2

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);


        ArrayList<Integer> numbers = new ArrayList<Integer>();


        // input loop

        System.out.println ("--- Enter 'q' to end input ---");

        while (true) 
        {

            String input = "";

            
            System.out.print("Plese enter a integer: ");
            input = in.nextLine();



            if (input.charAt(0)== 'q' || input.charAt(0)== 'Q' ) {
                System.out.println("Done entering integers. ");

                break;

            } else {

                int input_num = Integer.valueOf(input);

                numbers.add(input_num);

            }

                }

                // Variables
                int answer = 0;
                int lastTotal = 0;
            

                // Calulation  Loop

                for (int i = 0; i < numbers.size(); i++) {

                    int currentPos = i;
                    int currentNum = numbers.get(i);

                    if (i == 0) {
                        lastTotal = numbers.get(0);

                    } else {

                        if (currentPos % 2 == 1) {
                        
                        lastTotal = lastTotal - currentNum;

                    } else {
                        lastTotal = lastTotal + currentNum;
                    }

                    }
                }
            
                answer = lastTotal;

                // OUTPUT

                    System.out.println("Your input: ");
                    System.out.println(numbers);

                    System.out.println("Here is the alternating sum of the numbers: ");
                    System.out.println(answer);

            


            



    }
 
}
