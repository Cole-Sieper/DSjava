// Cole Sieper 
// 3/13/24
// Unit 9 Programming Project

import java.util.Scanner;
import org.derryfield.toys.Magic8Ball;

public class EightBall {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        Magic8Ball ball = new Magic8Ball();

        String question;

        System.out.print("Please enter a yes/no question for the Magic 8 Ball: ");
        question = in.nextLine();

        System.out.println("--- Here is your answer from the 8 ball ---");
        ball.shake();
        System.out.println(ball.displayAnswer());
        




    }
}