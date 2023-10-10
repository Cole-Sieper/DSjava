// Cole Seiepr
//Hw 6 part c

/* the false outcome is dues to a computer rounding error.
 to fix this we need to round up the number towhat it is 
 supposed to be.
 */

 // I was kind of confused on this hw

public class App {
    public static void main(String[] args) throws Exception {
        double a = 1.2; 
        double b= 3.0;
        final double EPSILON = 1E-14; // add epsilon to measue if the number is close
        double c = a * b; 

        //this checks to see if the value is very very close to the value
        //instead of it checking for a perfect equalt to value
        if(Math.abs(c - 3.6) < EPSILON){
        System.out.println("c is ~ 3.6");
        } else {
        System.out.println("c is not 3.6");
        }
    }
}
