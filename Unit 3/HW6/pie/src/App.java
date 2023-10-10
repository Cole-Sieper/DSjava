// Cole Sieper
//Hw 6 part A


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        //inititalize values
        double pieorder;
        double price_pie = 10.0;
        double discount = 0.9; //10% discount fro people who buy 3 or more pies
        double subtotal = 0;

        //inputs
        System.out.print("Welcome! How many pies would you like? (3 or more get 10% off): ");
        pieorder = in.nextInt();

        //let customer know they get a discount
        if (pieorder >= 3) {

            System.out.println("You get 10% off for your order size!");
            subtotal = (pieorder*price_pie) * discount;
        }

        // let custoemr knwo the total
        System.out.println("Your order total is: "+"$"+subtotal);

    }
}
