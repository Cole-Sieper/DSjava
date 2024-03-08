// Cole Sieper
// 3/8/24
// HW 26 Part D

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class PartD {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


        
        System.out.println("Before: "+ numbers);

    System.out.print("Please enter first number to swap: ");
    int index = in.nextInt();
    System.out.print("Please enter second number to swap: ");
    int index2 = in.nextInt();

    index = index -1;
    index2 = index2 -1;

        swap(numbers, index, index2);

        System.out.println("After: "+ numbers);



    }

public static void swap(ArrayList<Integer> list, int i,int j) {

    int number1 = list.get(i);
    int number2 = list.get(j);

    list.set(i,number2);
    list.set(j, number1);


}



}