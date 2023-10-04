import java.util.Scanner;

public class money {
    
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int currency;
    
        System.out.print("Input number of cents:"); 
        currency = input.nextInt();

        final int q = 25;
        final int d = 10;
        final int n = 5;
        final int p = 1;

        int numQuarter = currency / q;
       
        int numDime = currency / d;

        int numNickel = currency / n;
    
        int numPennie = currency / p;
    
        System.out.println("You are given back:");
        System.out.println(numQuarter + " " + "Quarters");
        System.out.println(numDime + " " + "Dimes");
        System.out.println(numNickel + " " + "Nickels");
        System.out.println(numPennie + " " +  "Pennies");



        
    }
}