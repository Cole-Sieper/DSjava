
import java.util.Scanner;

import mow.Yard;

public class Demo {

    public static void main(String[] args) {

        clearScreen();
        
        Yard yard = new Yard();
        Scanner in = new Scanner(System.in);

        int height;
        int width;

        

        System.out.print("Please enter the height of the yard (# of rows): ");
        height = in.nextInt();

        System.out.print("Please enter the width of the yard (# of rows): ");
        width = in.nextInt();

        yard.createLawn(height + 2, width + 2 );


        yard.printLawn();





    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}