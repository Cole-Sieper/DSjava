// Cole Sieper
// 2/2/24
// HW 21 PART A COUNTRY 

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;


public class App {
    public static void main(String[] args) throws FileNotFoundException {
        
        File inputFile = new File("Top5Unemployment.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[,\\s\\n]+");


        System.out.println("---------------------------------------------------------------");
        System.out.println("                   Top 5 Unemployment Rates");
        System.out.println("---------------------------------------------------------------");

        int i = 0;

        while (in.hasNextLine()) {
            String line = in.nextLine();

            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[,\\n]+");

            String name = lineScanner.next().trim();

            String nextWord = lineScanner.next().trim();

            double percentage = Double.valueOf(nextWord);

            nextWord = lineScanner.next().trim();

            int rank = Integer.valueOf(nextWord);

            String region = lineScanner.next().trim();
            
            if (i == 0)
            name = name.substring(3);
 
            System.out.printf("Ranked #%3d: %-16s | %6.2f%% | %-20s%n",
                    rank, name, percentage, region);

                    i++;

                    
        }
 

        System.out.println("---------------------------------------------------------------");



    }
}
