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

        for (int i = 0; i < 10000 ; i++) {

            number = Math.random();
            number = number * 10000 + 1;
            int j = (int) number;
            
            value[i] = j;

        }

        // initialize the target value
        int target = 0;
        
        
        /* 
        
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

        */
        

        for (int i = 1; i < 11; i++ ) {
        
            
            System.out.print(i+") Enter 10 integers to search for: ");
            target = in.nextInt();

            int output = linearSearch(value, target);
            double searchtime = System.currentTimeMillis();

            

            
                if (output >= 0) {
                System.out.println("The number "+target+" WAS found in the array!");
                System.out.println("Search-time: "+searchtime);
            } else {
                System.out.println("The number "+target+" WAS NOT found in the array :(");
                System.out.println("Search-time: "+searchtime);
            }
            System.out.println();

        }
        
        

    }

    public static int linearSearch(int[] array, int tgtVal) {

        Arrays.sort(array);
    
        int pos;

        pos = Arrays.binarySearch(array,tgtVal); 

            return pos;

       
        
        // double search_time = 0;
        // search_time = System.currentTimeMillis();






    }




}
