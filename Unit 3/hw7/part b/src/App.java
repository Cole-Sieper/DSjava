//Cole Sieper
//10/17/23
//Part B HW 7


// I have had a ton of trouble with this for some reason im not sure why it isnt working


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


        //initilzie age ranges
        boolean CHILD = age < 13;
        boolean ADULT = age > 13 && age < 50;
        boolean SENIOR = age > 49;

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
        if (day == "Monday") {
            if(age > 49) {
                System.out.println("You get 15% off!");
                mealcost = mealcost * mondiscount50;
             } 
            if(ADULT) {
                System.out.println("You get 5% off!");
                mealcost = mealcost * mondiscountall ;
             } 
            if(CHILD) {
                System.out.println("You get 7.5% off!");
                mealcost = mealcost * mondiscount13;
             }}

        if (day == "Tuesday") {

            if(SENIOR) {
                System.out.println("You get 7.5% off!");
                mealcost = mealcost * tuesdiscount50;
             } 
            if(ADULT) {
                System.out.println("Sorry there are no discounts available today :(");
                mealcost = mealcost;
             } 
            if(CHILD) {
                System.out.println("You get 5% off!");
                mealcost = mealcost * tuesdiscount13;
             }}

        if (day == "Wednesday") {

            if(SENIOR) {
                System.out.println("You get 7.5% off!");
                mealcost = mealcost * tuesdiscount50;
             } 
            if(ADULT) {
                System.out.println("Sorry there are no discounts available today :(");
                mealcost = mealcost;
             } 
            if(CHILD) {
                System.out.println("You get 5% off!");
                mealcost = mealcost * tuesdiscount13;

            }}

        if (day == "Thursday") {

            if(SENIOR) {
                System.out.println("You get 7.5% off!");
                mealcost = mealcost * tuesdiscount50;
             } 
            if(ADULT) {
                System.out.println("Sorry there are no discounts available today :(");
                mealcost = mealcost;
             } 
            if(CHILD) {
                System.out.println("You get 5% off!");
                mealcost = mealcost * tuesdiscount13;

            }}

        if (day == "Friday") {

            if(SENIOR) {
                System.out.println("You get 7.5% off!");
                mealcost = mealcost * tuesdiscount50;
             } 
            if(ADULT) {
                System.out.println("Sorry there are no discounts available today :(");
                mealcost = mealcost;
             } 
            if(CHILD) {
                System.out.println("You get 5% off!");
                mealcost = mealcost * tuesdiscount13;

            }}

        if (day == "Saturday") {

            if(SENIOR) {
                System.out.println("You get 7.5% off!");
                mealcost = mealcost * tuesdiscount50;
             } 
            if(ADULT) {
                System.out.println("Sorry there are no discounts available today :(");
                mealcost = mealcost;
             } 
            if(CHILD) {
                System.out.println("You get 5% off!");
                mealcost = mealcost * tuesdiscount13;

            }}

        if (day == "Sunday") {

            if(SENIOR) {
                System.out.println("You get 7.5% off!");
                mealcost = mealcost * tuesdiscount50;
             } 
            if(ADULT) {
                System.out.println("Sorry there are no discounts available today :(");
                mealcost = mealcost;
             } 
            if(CHILD) {
                System.out.println("You get 5% off!");
                mealcost = mealcost * tuesdiscount13;

            }}
        

        
        //outputs

        System.out.printf("Order Subtotal: $%.02f", mealcost);
         





    



        


































    }
}
