// Cole Sieper
// 12/7/23
// Programming Project 5 Project 2
// Barcode

import java.util.Scanner;

public class ProjectTwo {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        // inital user inputs to get a zip code in string form
        
        System.out.print("Please enter a zip code: ");
        String zipcode = in.nextLine();


        // pulling the moethod cose and using the zipcode as a input
        
        printBarCode(zipcode);




    }


    public static void getEncodedDigit(int d) {

        
        // takes each split up number from the pring barcode method and checks what number and prints the right pattern

        //print out each digit
        if (d == 1) {
        System.out.print(":::||");
        }
        if (d == 2) {
        System.out.print("::|:|");
        }
        if (d == 3) {
        System.out.print("::||:");
        }
        if (d == 4) {
        System.out.print(":|::|");
        }
        if (d == 5) {
        System.out.print(":|:|:");
        }
        if (d == 6) {
        System.out.print(":||::");
        }
        if (d == 7) {
        System.out.print("|:::|");
        }
        if (d == 8) {
        System.out.print("|::|:");
        }
        if (d == 9) {
        System.out.print("|:|::");
        }
        if (d == 0) {
        System.out.print("||:::");
        }


        

        

    }
    public static int getCheckDigit(String zipCode) {

        int checkDigit = 0;

        String newZip = zipCode;

        // splits up each number the same way as the barcode method to then calulate the check digit number

        String s1 = newZip.substring(0,1);
        String s2 = newZip.substring(1,2);
        String s3 = newZip.substring(2,3);
        String s4 = newZip.substring(3,4);
        String s5 = newZip.substring(4);

        int n1 = Integer.valueOf(s1);
        int n2 = Integer.valueOf(s2);
        int n3 = Integer.valueOf(s3);
        int n4 = Integer.valueOf(s4);
        int n5 = Integer.valueOf(s5);

        int total = n1+n2+n3+n4+n5;

        if (total <= 10){

           checkDigit = 10 - total; 

        } else {
        if (total <= 20){

           checkDigit = 20 - total; 

        } else {
        if (total <= 30){

           checkDigit = 30 - total; 

        } else {
        if (total <= 40){

           checkDigit = 40 - total; 

        } else {
        if (total <= 50){

           checkDigit = 50 - total; 

        }}}}} 
    
    
        return checkDigit;





    }
    public static void printBarCode(String zipCode) {

        /* This method take the inputed string then slipt up each number and converts it into a int
        then it puts each number into the get ecoded digit method to print out the right patterns for the barcode.
        finally it gives zipcode to the check digit method to calulate the right final digit a
        nd then prints it using the get encoded digit method
         */

        String newZip = zipCode;

        String s1 = newZip.substring(0,1);
        String s2 = newZip.substring(1,2);
        String s3 = newZip.substring(2,3);
        String s4 = newZip.substring(3,4);
        String s5 = newZip.substring(4);

        int n1 = Integer.valueOf(s1);
        int n2 = Integer.valueOf(s2);
        int n3 = Integer.valueOf(s3);
        int n4 = Integer.valueOf(s4);
        int n5 = Integer.valueOf(s5);

       

        System.out.print("|");
        getEncodedDigit(n1);
        getEncodedDigit(n2);
        getEncodedDigit(n3);
        getEncodedDigit(n4);
        getEncodedDigit(n5);
        getEncodedDigit(getCheckDigit(zipCode));
        System.out.print("|");



    }
    

}




    