// Cole Sieper
// 11/1/23
// HW 9 Part C

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);


        //initialize variables
        double number;

        for (int count = 0; count < 11; count++) {

            number = Math.random();
            number = number * 10;
            System.out.printf("%02.1f%n",number);

        }






    }
}
