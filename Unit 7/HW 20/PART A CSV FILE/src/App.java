// Cole Sieper
// 1/31/24
// HW 20 Part A csv file

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        
        File inputFile = new File("customerdata.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[,\\s\\n]+");

        // VARIBALES
        int count = 0;

        System.out.println("-----------------------------------------------");
        System.out.println("    ID    |       NAME       |      BALANCE");
        System.out.println("-----------------------------------------------");

        while(in.hasNext()) {

            
            String id = in.next();
            System.out.print("  000"+id.substring(0, 3)+"  |");

            String name = in.next();
            System.out.printf("   %10s     |",name);
            
            
            double balance = in.nextDouble();
            System.out.printf("   $ %,9.2f%n",balance);
            
            

            in.nextLine();
            count++;



        }

      




        



    }
}
