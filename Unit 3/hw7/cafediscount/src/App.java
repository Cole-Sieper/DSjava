//Cole Sieper
//10/17/23
//Part A HW 7


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner in = new Scanner(System.in);

        //initialize input variables
        int age = 0;
        String day = "";
        double mealcost = 0;

        //other variables

        final String Monday = "Monday";
        final String Tuesday = "Tuesday";
        final String Wednesday = "Wednesday";
        final String Thursday = "Thursday";
        final String Friday = "Friday";
        final String Saturday = "Saturday";
        final String Sunday = "Sunday";


        //--initilize discounts--

        //monday discounts
        double mondiscount13 = .925;
        double mondiscount50 = .85;
        double mondiscountall = .95;

        //tues-sunday discounts
        double tuesdiscount13 = .95;
        double tuesdiscount50 = .925;


        System.out.println("Welcome to the cougar cafe! We have discounts today.");
        System.out.print("What day is it? (first letter capital): ");
        day = in.nextLine();
        System.out.print("Also, how old are you?: ");
        age = in.nextInt();
        System.out.print("Meal cost: ");
        mealcost = in.nextDouble();

        
        //sorting and calulating discounts
        if (day == Monday); {
            if(age >= 50) {
                System.out.println("You get 15% off!");
                mealcost = mealcost * mondiscount50;
            } else {
                if (age < 13) {
                    System.out.println("You get 7.5% off!");
                    mealcost = mealcost * mondiscount13;
                } else {
                    System.out.println("You get 5% off!");
                    mealcost = mealcost * mondiscountall;
                } if (day == Tuesday) {
                    if(age >= 50) {
                System.out.println("You get 7.5% off!");
                mealcost = mealcost * tuesdiscount50;
            } else {
                if (age < 13) {
                    System.out.println("You get 5% off!");
                    mealcost = mealcost * tuesdiscount13;
                } else {
                    if(age >= 50) {
                System.out.println("You get 7.5% off!");
                mealcost = mealcost * tuesdiscount50;
            } else {
                if (age < 13) {
                    System.out.println("You get 5% off!");
                    mealcost = mealcost * tuesdiscount13;
                } else {
                    
                    System.out.println("Sorry, there are no discoutns available today :(");
                    
                }}}}}}}


        
        //outputs

        System.out.printf("Order Subtotal: %.02f", mealcost);
         





    



        


































    }
}
