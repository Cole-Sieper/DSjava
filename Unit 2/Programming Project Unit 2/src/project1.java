// Project 1
// Cole Sieper
// 10/3/23

/* Prompt the user for an amount of time in seconds.
Converts the time into hours, minutes and seconds.
Displays the converted time to the users in HH:MM:SS format.
*/



import java.util.Scanner; //importing the scanner
public class project1 {
    
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in); 

        int num_seconds = 0; //variable for second input 
        int num_min = 0;
        int num_hour = 0;
        final int second = 1; // second value
        final int minute = 60; // minute in seconds
        final int hour = 3600; // hour in seconds
        
    
        //input number of seconds
        System.out.print("Input a time in seconds: "); 
        num_seconds = in.nextInt();


        //converting the value and sorting
        if (num_seconds >= 3600) { //if value is greater than 1 hour

            num_hour = num_seconds / hour;
            num_seconds = num_seconds % hour;

            num_min = num_seconds / minute;
            num_seconds = num_seconds % minute;

            num_seconds = num_seconds / second;

        }

        else {

                num_hour = 00;
            

            if (num_seconds >= 60) {  //if value is greater than 1 minute but NOT 1 hour

            num_min = num_seconds / minute;
            num_seconds = num_seconds % minute;

            num_seconds = num_seconds / second;

            }

            else { // if value is NOT greater than 1 minute

                num_hour = 00;
                num_min = 00;

                num_seconds = num_seconds / second;


            }

        }

            //outputs
            System.out.println("-----");
            System.out.println("How much time you have:  (Hours : Minutes : Seconds)");
            System.out.printf("You have: %02d:%02d:%02d",num_hour,num_min,num_seconds);
            //fortats the time into HH:MM:SS
    }

}