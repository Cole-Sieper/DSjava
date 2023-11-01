// Cole Sieper
// 11/1/23
// HW 9 Part B

//used a little help from chat gpt to figure out the check if e thing

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        

        //input word
        System.out.print("Enter a word: ");
        String word = in.nextLine();

        // Initialize variable 
        int E_count = 0;

        // Loop to check each character position and then check if it is a e
        for (int i = 0; i < word.length(); i++) {
            // check what the character is at the current position
            char currentChar = word.charAt(i);

            // add to the e count if there is lower case or upper case e in the current position
            if (currentChar == 'e' || currentChar == 'E') {
                E_count++;
            }
        }

        // output
        System.out.println("The letter E occurs " + E_count + " time(s) in the phrase.");
        
    }
}

