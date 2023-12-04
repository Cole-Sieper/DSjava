// Cole Sieper
// 11/28/23
// HW 12 Part B



import java.util.Scanner;

public class Smallest {

    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        // varables
        double first = 0;
        double second = 0;
        double third = 0;


        // user inputs the thre numbers they want

        System.out.print("Please enter your first number: ");
        first = in.nextDouble();

        System.out.print("Please enter your second number: ");
        second = in.nextDouble();

        System.out.print("Please enter your third number: ");
        third = in.nextDouble();

      
        // calling the method with the 3 numbers the user inputed

        smallest(first, second, third);

    


    }


    public static double smallest(double x, double y, double z) {

        // the 3 numbers set to high above each value
        
        double smallest = x + y + z + 9999999;
        double middle = x + y + z + 9999999;
        double largest = x + y + z + 9999999;

        
                 
        // if statements to find if each variable is the lowest
        
                    // check if x is the lowest
                    if (x >= 0 && x <= 9999999) {
                        if (x < smallest) {
                            largest = middle;
                            middle = smallest;
                            smallest = x;
                        } else if (x < middle) {
                            largest = middle;
                            middle = x;
                        } else {
                            largest = x;
                        }
                    } 

                    // check if y is the lowest and set the others
                    if (y >= 0 && y <= 9999999) {
                        if (y < smallest) {
                            largest = middle;
                            middle = smallest;
                            smallest = y;
                        } else if (y < middle) {
                            largest = middle;
                            middle = y;
                        } else {
                            largest = y;
                        }
                    } 


                    // check if z is the lowest and set the others 
                    if (z >= 0 && z <= 9999999) {
                        if (z < smallest) {
                            largest = middle;
                            middle = smallest;
                            smallest = z;
                        } else if (z < middle) {
                            largest = middle;
                            middle = z;
                        } else {
                            largest = z;
                        }
                    } 
                 

                    // output to the user what the smallest number is after the calulations
                System.out.println("This is the smallest number: "+ smallest);
                    return smallest;




      






    }




}
