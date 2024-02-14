// COLE SIEPER
// 2/14/24
// HW 22 PART B BIRHT YEARS

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        File inputfile = new File("birthyears.txt");
        Scanner in = new Scanner(inputfile);
        in.useDelimiter("[,\\s\\n]+");

        while (in.hasNext()) {

            String name = in.next().trim();

            String year = in.next().trim();

            if (Character.isDigit(year.charAt(0))) {

                int YEAR = Integer.parseInt(year);

                System.out.println(name+" was born in "+ year+".");

            } else {

                System.out.println("I do not know what year "+name+" was born.");

            }
            



        }



    }
}
