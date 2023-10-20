// cole sieper
// part A attempt 2

import java.util.Scanner;


public class App {
    public enum CustomerType {CHILD, ADULT, SENIOR}
    public enum DayOfWeek {MONDAY, OTHER_DAY}

    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        // initilize discount variables

        //monday discounts
        double mondiscount13 = .925;
        double mondiscount50 = .85;
        double mondiscountall = .95;

        //tues-sunday discounts
        double tuesdiscount13 = .95;
        double tuesdiscount50 = .925;


        //ask user if it is a monday

        DayOfWeek today = DayOfWeek.OTHER_DAY;
        System.out.print("is today a monday? (y/n): ");
        String reply = in.next();

        // covert all to lowercase
        reply = reply.toLowerCase();

        // if they typed y or n

        if (reply.equals("y")) {

                today = DayOfWeek.MONDAY;

        }

        // ask user for age
        int age = 0;
        System.out.print("Enter Customers Age: ");
        age = in.nextInt();


        //assign a cutomer type based on age
        CustomerType customerType = CustomerType.ADULT;
        if (age >= 50)  {
            customerType = CustomerType.SENIOR;
        } else if (age < 13)  {
            customerType = CustomerType.CHILD;
        } else {
            //everyone else is an adult
            customerType = CustomerType.ADULT;
        }

        System.out.print("Enter total meal cost: ");
        double mealcost = in.nextDouble();

        // sort out the discounts
        if (today == DayOfWeek.MONDAY)  {
            if (customerType == CustomerType.CHILD) {
                System.out.println("You get a 7.5% discount!");
                mealcost = mealcost * mondiscount13;
            } else if (customerType == CustomerType.SENIOR) {
               System.out.println("You get a 15% discount!"); 
               mealcost = mealcost * mondiscount50;
            } else {
                //adults get 5% off on monday
                System.out.println("You get a 5% discount!");
                mealcost = mealcost * mondiscountall;
            }
        } else {
            if (customerType == CustomerType.CHILD) {
                System.out.println("You get a 5% discount!");
                mealcost = mealcost * tuesdiscount13;
            } else if (customerType == CustomerType.SENIOR) {
                System.out.println("You get a 7.5% discount!");
                mealcost = mealcost * tuesdiscount50;
            } else {
                //adults dont get discount
                System.out.println("Sorry, no discounts are available :(");
            }
        }

        System.out.printf("Here is your order total: $%.02f",mealcost);


    }
}
