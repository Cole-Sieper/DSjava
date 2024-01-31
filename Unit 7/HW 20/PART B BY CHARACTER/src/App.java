// Cole Sieper
// 1/31/24
// HW 20 PART B CHARACTERS

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        File inputFile = new File("characters.txt");
       Scanner in = new Scanner(inputFile);
       in.useDelimiter("");
       int count = 0;
       int letters = 0;
       int digits = 0;
       while (in.hasNext()) {
           char c = in.next().charAt(0);
           System.out.print(c);
           count++;
           
           if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0' ) {
            digits++;
           } else {
            if (c == ' ') {} else {if (c == '.') {} else {
                    letters++;
                }}
        
           }
       }
       System.out.printf("count = %d%n", count);
       System.out.printf("letters = %d%n", letters);
       System.out.printf("digits = %d%n", digits);
    }
}
