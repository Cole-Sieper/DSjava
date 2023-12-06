// Cole Sieper
// 12/1/23
// HW 12 part C


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);


        String shortPhrase = "";

        // ask the user for a phrase
        System.out.print("Please enter a phrase: ");
        shortPhrase = in.nextLine();

        // call the method to chech how many vowels in the entered phrase
        countVowels(shortPhrase);


    }

// vowels: a, e, i, o, and u

public static int countVowels(String phrase) {

    //variable to cout the number of vowel that are detected
    int vowelCount = 0;

    // set the phrase to all caps to make the next part work 
    phrase = phrase.toUpperCase();

    // loop and if statemnts to check each position for vowels
    for (int i = 0; i < phrase.length(); i++) {

        char currentChar = phrase.charAt(i);

        if (currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
            vowelCount++;
        }
        
    }

    

    // output the result to the user
    System.out.println("There are " + vowelCount + " vowels in the phrase.");
    
    return vowelCount;


}








}