// Cole Sieper 
// question 7 test practice
// 11/3/23


import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        
        //input from user for word to edit
        System.out.print("Enter a word you like: ");
        String word = in.nextLine();

        //initialize the string builder to edit the existing word
        StringBuilder output = new StringBuilder();

        // loop to check each letter position if it is even or 0
        //remove letter if it is even or 0
        for (int i = 0; i < word.length();i+=2) {
            output.append(word.charAt(i));
        }

        //output new modified word
        System.out.println("Updated word: "+ output);

    }
}
