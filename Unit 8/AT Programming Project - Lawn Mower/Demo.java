
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

        int newHeight = height +2;
        int newWidth = width +2;

        yard.createLawn(newHeight, newWidth);

        mower.initialize(yard,newHeight,newWidth);
        yard.printLawn();


        int i = 0;
        
        while (true) {

            mower.sense(yard);
            
                /*while (mower.checkFront == 1) {
                    mower.turnRght();
                    mower.sense(yard);
                }*/

                if (mower.checkFront == 1) {
                    if (mower.checkRight == 1) {
                        if (mower.checkLeft == 1) {
                            break;
                        } else {mower.turnLeft();}
                    } else {mower.turnRght();}
                }
                
            
                mower.moveFoward();

                mower.mow(yard);

            delay(500);

                clearScreen();
                clearScreen();

            yard.printLawn();
        

            i++;
        }

        //System.out.println(mower.getRow());
        //System.out.println(mower.getCol());


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