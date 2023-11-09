// Cole Sieper
// 11/9/23
// Unit 3 Test Question 5 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int num = 2;
        int sum = 0;

        while (num <= 100) {

            if (num % 2 == 0) {

                sum = sum + num;

            }
            num++;

        }
        
        System.out.println("Sum of all even integers: "+sum);


    }
}
