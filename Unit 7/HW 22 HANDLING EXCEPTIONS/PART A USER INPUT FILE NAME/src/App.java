// Cole Sieper
// 2/14/24
// HW 22 PART A 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        
        
        Scanner inKeyboard = new Scanner(System.in);
        boolean fileOpened = false;
        String name = "";


        System.out.print("Please enter a file name (enter # to quit): ");
            name = inKeyboard.nextLine();

        while (fileOpened == false) {

            try {

                if (name.equals("#")) {
                    System.out.println("Input ended, Goodbye :)");
                    break;
                } 

                

                File inputFile = new File(name);
                Scanner in = new Scanner(inputFile);

                while (in.hasNext()) {
                String word = in.next();
                System.out.println(word);
                }
                

                in.close();
                fileOpened = true;
            

            } catch (FileNotFoundException exception) {
                System.out.println("Error: unable to find the file named \"" + name + "\".");
                System.out.print("Please enter a new file name (enter # to quit): ");
                name = inKeyboard.nextLine();
            }

    }


}
}


