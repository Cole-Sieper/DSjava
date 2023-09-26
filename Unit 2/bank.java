import java.util.Scanner;

public class bank {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);


        //initialize each user variable
        int User1 = 0;
        int User2 = 0;
        int User3 = 0;    

        //initialize each balance varible
        double bal1 = 0;
        double bal2 = 0;
        double bal3 = 0;

        //first acoutn id and balance input
        System.out.print("Enter the 1st account ID: ");
        User1 = in.nextInt();
        System.out.printf("Enter the balance for ID = %05d ($): ",User1);
        bal1 = in.nextDouble();

        //second id and ballance input
        System.out.print("Enter the 2nd account ID: ");
        User2 = in.nextInt();
        System.out.printf("Enter the balance for ID = %05d ($): ",User2);
        bal2 = in.nextDouble();
        
        // third id and balance input
        System.out.print("Enter the 3rd account ID: ");
        User3 = in.nextInt();
        System.out.printf("Enter the balance for ID = %05d ($): ",User3);
        bal3 = in.nextDouble();


        //Outputs
        System.out.println("-----Balances-----");
        System.out.printf("ID is %05d, balance is $%.2f", User1, bal1);
        System.out.printf("ID is %05d, balance is $%.2f%n", User2, bal2);
        System.out.printf("ID is %05d, balance is $%.2f%n", User3, bal3);
        

    }
}
