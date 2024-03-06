// Cole Sieper
// 3/6/24
// HW 25 AT PART B

import java.util.ArrayList;
import java.util.Scanner;

class CashRegister {
    private ArrayList<Double> items;
    private int count = 0;
    private double total =0;
 
 
    /*
     * Constructor.
     */
    public CashRegister() {
        // put implementation here.
        items = new ArrayList<>();
    }
 
 
    /*
     * Add the price of an item to the register's total.
     */
    public void addItem(double price) {
        // put implementation here.
        items.add(price);
        total = total + price;
        count++;
    }
 
 
    /*
     * Remove the most recently added item from the current sale.
     */
    public void removeItem() {
        // put implementation here.
        total = total - items.get(count-1);
        items.remove(count-1);
        count = count-1;
        
    }
 
 
    /*
     * Return the current total sales amount.
     */
    public double getTotal() {
        // put implementation here.
        return total;
    }
 
 
    /*
     * Return the total count of items in the current sale.
     */
    public int getCount() {
        // put implementation here.
        return count;
    }
 
 
    /*
     * Clear the register (total and count) for a new sale.
     */
    public void clear() {
        // put implementation here.
        for (int i = 0; i<items.size(); i++) {
            items.remove(i);
            count = 0;
            total = 0;
        }
    }
 }

 
 

public class CreateCashRegister {

    public static void main (String[] args) {

        CashRegister cr = new CashRegister();
        Scanner in = new Scanner(System.in);

        /*
        User enters in a number value to add to the sales total and to increase the item count
        User enters a 't' to display the sales total and item count
        User enters a 'd' to delete the most recent sales entry (and decrease the item count)
        User enters a 'c' to clear the current sales total and item count
        User enters a 'q' to quit the program

         */

         System.out.println("  User enters in a number value to add to the sales total \r\n" + //
                          "        't' to display the sales total \r\n" + //
                          "        'd' to delete the most recent sales entry \r\n" + //
                          "        'c' to clear the current sales total \r\n" + //
                          "        'q' to quit the program");

        while (true) {

            System.out.print("Please enter an input: ");
            String input = in.nextLine();

            if (input.equalsIgnoreCase("t")) {
            System.out.println("Your current total is: "+cr.getTotal());
            System.out.println("You have entered "+cr.getCount()+ " items");
            } else {
            if (input.equalsIgnoreCase("d")) {
            cr.removeItem(); System.out.println("Last Item Deleted");
            } else {
            if (input.equalsIgnoreCase("c")) {
            cr.clear(); System.out.println("Cleared");
            } else {
            if (input.equalsIgnoreCase("q")) {
            System.out.println("Goodbye! :)");
            break;
            } else {

                double priceInput = Double.parseDouble(input);
                cr.addItem(priceInput);

            }}}}
            






        }



    }

}