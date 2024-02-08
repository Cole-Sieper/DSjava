// Cole Sieper
// 2/8/24
// UNIT 7 TEST

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;


public class App {
    public static void main(String[] args) throws FileNotFoundException {
        
        File inputFile = new File("billionaires.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[;\\n]+");


        double money = 0;
        double tax = 0;

        int i = 0;

        System.out.println("       Name                Net Worth              Tax Level           Country");
        System.out.println("--------------------------------------------------------------------------------");

        while (in.hasNextLine()) {
            String line = in.nextLine();

            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[;\\n]+");

            String name = lineScanner.next().trim();


            String nextWord = lineScanner.next().trim();

            nextWord = nextWord.replace("$", "");
            nextWord = nextWord.replaceAll(",", "");
            
            money = Double.valueOf(nextWord);

            tax = money *0.03;
            


            String country = lineScanner.next().trim();
           

            System.out.printf(" %-16s |  $ %,12.2f |  $ %,12.2f |  %-10s %n",
                    name, money, tax, country);

            

                    
        }
 

       


    }
}
