// Cole Sieper
// 2/2/24
// HW 21 PART B SALES 

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;


public class App {
    public static void main(String[] args) throws FileNotFoundException {
        
        File inputFile = new File("sales_by_cat.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[,\\s\\n]+");


        double sales = 0;

        int i = 0;

        while (in.hasNextLine()) {
            String line = in.nextLine();

            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[,\\n]+");

            String deptname = lineScanner.next().trim();


            String manager = lineScanner.next().trim();


            String nextWord = lineScanner.next().trim();

            if (Character.isDigit(nextWord.charAt(0)) || Character.isDigit(nextWord.charAt(1)))
            sales = Double.valueOf(nextWord);

           
 
            System.out.printf(" %-12s |  %-10s | $ %8.2f %n",
                    deptname, manager, sales);

            

                    
        }
 

       


    }
}
