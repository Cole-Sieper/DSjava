// Cole Sieper
// 1/16/24
// Project 1


/* Write a program that initializes an array with ten random integers and then prints four lines of output, containing
Every element at an even index.
Every even element.
All elements in reverse order.
Only the first and last element.
 */

 import java.util.Scanner;
 import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);


        //initialize variables
        double number;

        // initialize the array

        int[] value = new int[10];

        for (int i = 0; i < 10 ; i++) {

            number = Math.random();
            number = number * 10000 + 1;
            int j = (int) number;
            
            value[i] = j;

        }

        System.out.println();
        System.out.println("----- ARRAY INITIALIZED");
        System.out.println();

        
        for (int i = 0; i < value.length; i++ ) {

            System.out.println(value[i]);

            
        }



        System.out.println();
        System.out.println("----- EVEN INDEX");
        System.out.println();

        // OUTPUT 1 EVEN INDEX

        for (int i = 0; i < value.length; i++ ) {

            int index = i;

            if (index % 2 == 0) {

                System.out.println(value[i]);

            }
        }


        System.out.println();
        System.out.println("----- EVERY EVEN ELEMENT");
        System.out.println();


        // OUTPUT 2 EVERY EVEN ELEMENT

        for (int i = 0; i < value.length; i++ ) {

            int currentNum = value[i];

            if (currentNum % 2 == 0) {

                System.out.println(value[i]);

            }
        }


        System.out.println();
        System.out.println("----- FIRST & LAST");
        System.out.println();


        // OUTPUT 3 FIRST & LAST

        System.out.println(value[0]);
        System.out.println(value[9]);


        System.out.println();
        System.out.println("----- REVERSE ORDER");
        System.out.println();


        // OUTPUT 3 REVERSE ORDER

        Arrays.sort(value);
        

        for (int i = 0; i < value.length; i++) {

            int j = value.length - i - 1;
            
                
                System.out.println(value[j]);

        }
        



    }
}
