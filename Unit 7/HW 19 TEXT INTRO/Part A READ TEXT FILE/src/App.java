// Cole Sieper
// 1/25/24
// HW 19 Part A TEXT FILE



import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);

        ArrayList<Integer> Number = new ArrayList<Integer>();


        // variables

        int lowestTemp = 0;
        
       
        
        // scan values
        while (in.hasNext()) {

            int value = in.nextInt();
            Number.add(value);

        }
        


        // find lowest temp

        for (int i = 0; i < Number.size(); i++) {

            if (i == 0) {

                lowestTemp = Number.get(0);

            } else {

                if (lowestTemp > Number.get(i))
                    lowestTemp = Number.get(i);

            }
        }

        // output loop

        for (int i = 0; i < Number.size(); i++) {

            if (Number.get(i) == lowestTemp) {
                System.out.printf("%3d  <-- Lowest Temp %n",Number.get(i));
            } else {
                System.out.printf("%3d%n",Number.get(i));
            }

        }



            in.close();














    }
}
