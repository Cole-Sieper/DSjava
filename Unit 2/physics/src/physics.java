import java.util.Scanner;

public class physics {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double height1=0; //varible for initial height (m)
        double time1=0; //varible for amount of time elapsed in the fall (s)
        double velocity1=0; //variable for initial velocity (m/s)
        double answer; //final result of the equation
        final double gravity = -9.81;
        double timesquared = time1 * time1; //t^2 in the equation

        System.out.println("Enter value then click enter");
        System.out.println("---------------------------");
        System.out.print("Enter initial height in meters: ");
        height1 = input.nextDouble();

        System.out.print("Enter time elapsed in seconds: ");
        time1 = input.nextDouble();

        System.out.print("Enter initial velocity in m/s: ");
        velocity1 = input.nextDouble();

        double last = (0.5*gravity)*timesquared;
        /* calculates the 2n half of the eqution ½·g·t2 to  
        make sure it stays with pemdas*/ 

        double middle = velocity1*time1; // middle of the eqution with multiplication v0·t
        double first = height1;

        answer = (first + middle)+last; //calculates the whole equation's last step: addition left to right

        System.out.println("---------------------------");
        System.out.print("HERE IS YOUR ANSWER!!"+" ");
        System.out.println(answer);
    } 
}
