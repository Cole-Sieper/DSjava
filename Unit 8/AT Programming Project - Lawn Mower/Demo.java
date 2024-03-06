
import java.util.Scanner;

import mow.Yard;
import mow.Mower;

public class Demo {

    public static void main(String[] args) {

        clearScreen();
        
        Yard yard = new Yard();
        Mower mower = new Mower();
        Scanner in = new Scanner(System.in);

        int height;
        int width;

        

        System.out.print("Please enter the height of the yard (# of rows): ");
        height = in.nextInt();

        System.out.print("Please enter the width of the yard (# of rows): ");
        width = in.nextInt();

        yard.createLawn(height + 2, width + 2 );

        


        yard.printLawn();

        
        for (int i = 0; i < 50; i++) {

            mower.mow(yard);

            mower.sense(yard);
            
                while (mower.checkBrick == 1) {
                    mower.turnRght();
                    mower.sense(yard);
                }
            
                mower.moveFoward();

            delay(500);

                clearScreen();
                clearScreen();

            yard.printLawn();
        }




    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }
 


}