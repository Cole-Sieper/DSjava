// COLE SIEPER
// 2/16/24
// HW 23 PART A

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        try {
        int quiz = getQuizScore(in);
        System.out.println("The Quiz Score is "+quiz+"%");
        } catch (Exception e) {
            System.err.println("AN ERROR OCCURED!");
            System.out.println(e.getMessage());

        }



    }


    public static int getQuizScore(Scanner in) {

        System.out.print("Enter a Quiz Score (0-100): ");
        int score;
        try {
        score = in.nextInt();
        if (score < 0 || score > 100) {
            throw new ArithmeticException("Input out of range");
        } else
        return score;

        } catch (InputMismatchException e) {
            throw new InputMismatchException("ERROR: INPUT MISMATCH EXCEPTION ");
            
        }



}




}
