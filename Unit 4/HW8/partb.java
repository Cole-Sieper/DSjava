// Cole Sieper
// 10/30/23
// HW 8 Part B


import java.util.Scanner;

public class partb {
    public static void main(String[] args) throws Exception {


        Scanner in = new Scanner(System.in);

        //initialize variables
        double APR = 0;
        double bal = 0;
        double interest = 0;
        

        //ask user for inputs
        System.out.print("What is the APR? (as a percentage, for example: 5.5): ");
        APR = in.nextDouble();
        System.out.print("What is your starting balance? : ");
        bal = in.nextDouble();

        //retructure APR for eaiser math
        APR = APR / 100;

        System.out.println("Year |        INT EARNED ($)       |           BALANCE ($)            ");
        System.out.println("----------------------------------------------------------------------");

        for (int year = 1; year < 6; year++) {

            interest = bal * APR;
            bal = bal + interest;

            System.out.printf("  %d  |                      %6.2f |                          %8.2f%n",year,interest,bal);
        
        }

        

            
            
            

        



        
    }
}
