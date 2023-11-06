// Cole Sieper
// 11/6/23
// AT Calander Assignment


import java.time.LocalDate;
import java.time.DayOfWeek;

public class App {
    public static void main(String[] args) throws Exception {
        
        //variable to point to the local date class
        LocalDate rightNow = LocalDate.now();
        
        //initialize current day, month, and year
        int year = rightNow.getYear();
        int month = rightNow.getMonthValue();

        //fist day on month variable
        LocalDate firstDayOfMonth = rightNow.of(year, month, 1);

        //total days in month variable
        int lengthOfMonth = firstDayOfMonth.lengthOfMonth();

        //find the day of the week for the first 
        DayOfWeek dayOfWeek = firstDayOfMonth.getDayOfWeek();

        // get the day of the month for today.
        int today = rightNow.getDayOfMonth();

        // get value of the day of week variable 1-7
        int value = dayOfWeek.getValue();


        System.out.println("Mon Tue Wed Thu Fri Sat Sun ");

        // loops through every day in the month checking if there is a day or not and printing

        for (int i =1; i <= lengthOfMonth; i++ ) {
            if (i <= value - 1) {
                //checks each spot to find the right place to print the forst day
                System.out.print("    ");
            } else {
                //varable to chack day and print if it is today or not
                //variable to create the number of the day then print
                int day = i - value +1;
                if (day == rightNow.getDayOfMonth()) {
                System.out.printf(" %2d*", day);
                } else {
                System.out.printf(" %2d ", day); 
                }
            }

            //if is at the 7 day mark it breaks to the next line
            if (i % 7 == 0 ) {
                System.out.println();

            } 
        }
        
    


        

        


        







    }
}
