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

        




    }

    public static int linearSearch(int[] array, int tgtVal) {

        Arrays.sort(array);
    
        int search = 0;

        search = Arrays.binarySearch(array,tgtVal); 

        if ()

        
        // double search_time = 0;
        // search_time = System.currentTimeMillis();






    }




}
