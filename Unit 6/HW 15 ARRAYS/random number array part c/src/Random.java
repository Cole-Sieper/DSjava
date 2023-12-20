// Cole Sieper
// 12/18/23
// HW 15 Part C
// random number array

import java.util.Arrays;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) throws Exception {
        


        Scanner in = new Scanner(System.in);


        //initialize variables
        double number;

        // initialize the array

        int[] value = new int[10000];

        for (int i = 0; i <= 10000 ; i++) {

            number = Math.random();
            number = number * 10000 + 1;
            int j = (int) number;
            
            value[i] = j;

        }

        // initialize the target value
        int target = 0;
        
        // USER INPUTS TARGET NUM

        System.out.print("Please enter a number to search for: ");
        target = in.nextInt();


        // OUTPUT

        int output = linearSearch(value, target);
    
         if (output >= 0) {
            System.out.println("The number "+target+" was found in the array!");
        } else {
            System.out.println("The number "+target+" was not found in the array :(");
        }



    }

    public static int linearSearch(int[] array, int tgtVal) {

        Arrays.sort(array);
    
        int search;

        search = Arrays.binarySearch(array,tgtVal); 

            return search;

       
        
        // double search_time = 0;
        // search_time = System.currentTimeMillis();






    }




}
