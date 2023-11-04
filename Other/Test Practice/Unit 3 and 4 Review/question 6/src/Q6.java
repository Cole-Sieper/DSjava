// Cole Sieper
// Question 6 test practice


import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        // initialize the variables
        
        int smallest =9;
        int middle =9;
        int largest =9;
        
        System.out.println("Enter three single-digit integers (no negatives): ");


        // input -- rotates through  each number and checsk if it is less 
        // or more than the previous character s and sets it place. 
              for (int i = 1; i < 4; i++) {
                System.out.print(i+": ");
                    int num = in.nextInt();
        
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
                    } else {
                        System.out.println("Please enter a single-digit integer.");
                        i--; // number check to make them re-enter the number if it is negative or 10+
                    }
                }

                //output for assending order of numbers
        
                System.out.println("Sorted numbers in ascending order: " + smallest + " " + middle + " " + largest);
        
                
    }
}
                





