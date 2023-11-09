// Cole Sieper
// Unit 3 Test Question 7


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        // set all variables to start at max possible value to then sort out
        
        int num ;
        int smallest = 9;
        int middle = 9;
        int largest = 9;
        
        System.out.println("Input three single-digit integers : ");


        /* 
        
        since all the numbers start at their max it checks each newly inputed number to see if it is lower than the last. 
        say you inputted 6 for the first number it will see it is lower than the existing smallest numebr so will shift the last smallest to the middle and 
        make the new number the new smallest
        
        if the next numer you input is smaller again thean the last number you put in then it will now recognize that as the the new small and shift the other up again.

        it keeps looping this until the user has inputed 3 numbers
        */ 
              for (int i = 1; i < 4; i++) {
                System.out.print(i+": ");
                    num = in.nextInt();
        
                    if (num >= 0 && num <= 9) {
                        if (num < smallest) {
                            largest = middle;
                            middle = smallest;
                            smallest = num;
                        } else if (num < middle) {
                            largest = middle;
                            middle = num;
                        } else {
                            largest = num;
                        }
                    } 
                    }

                

                //output
        
                System.out.println("Numbers in order: " + smallest + " " + middle + " " + largest);
        
                
    }
}
                





