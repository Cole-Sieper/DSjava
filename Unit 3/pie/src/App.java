// Cole Sieper
//Hw 6 part A


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        //inititalize values
        int pie_order = 0;
        double price_pie = 10.0;
        double discount = 0.9; //10% discount fro people who buy 3 or more pies
        double subtotal = pie_order*price_pie;

        //inputs
        System.out.println("Welcome! How many pies would you like? (3 or more get 10% off): ");
        pie_order = in.nextInt();

        //let customer know they get a discount
        if (pie_order >= 3) {

            System.out.println("You get 10% off for your order size!");
            subtotal = subtotal * discount;
        }

        // let custoemr knwo the total
        System.out.println("Your order total is: "+"$"+subtotal);

    }
}
