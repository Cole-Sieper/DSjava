//cole sieper
//hw 6 part d 
//10/10/23

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner in = new Scanner(System.in);

        //initialize variables
        int numorder = 0;
        double cookie_price = 0.99;
        double subtotal = numorder*cookie_price;
        double offer1 = 0.975;
        double offer2 = 0.95;
        double offer3 = 0.85;


        //inputs from customer
        System.out.println("Welcome! We have many discounts running today!");
        System.out.print("How many Cookies are you looking to buy?: ");
        numorder = in.nextInt();

        // if statements to check if order is valid for discount
        if (numorder >= 24){ //checks the 24 cookie discount
            subtotal = cookie_price*numorder*offer3;
            System.out.println("You get a 15% discount!");
            } else {

            if (numorder >= 12){ // checks to 12 cookie discount
                subtotal = cookie_price*numorder*offer2;
                System.out.println("You get a 5% discount!");
            } else {

                if (numorder >= 6) { // checks the 6 cooke discount
                    subtotal = cookie_price*numorder*offer1;
                    System.out.println("You get a 2.5% discount!");
                } else {subtotal = numorder*cookie_price;}
            }
        }
    
        //output of price to customer
        System.out.println("Your order total is: "+"$"+subtotal);


    }
}
