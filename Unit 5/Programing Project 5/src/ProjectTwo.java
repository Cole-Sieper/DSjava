// Cole Sieper
// 12/7/23
// Programming Project 5 Project 2
// Barcode

import java.util.Scanner;

public class ProjectTwo {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a zip code: ");
        int zipcode = in.nextInt();

        printBarCode(zipcode);




    }


    public static void getEncodedDigit(int d) {

        
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


        
/* 
        //print out each digit
            if (d == 1) {
            return ":::||";
            }
            if (d == 2) {
            return "::|:|";
            }
            if (d == 3) {
            return "::||:";
            }
            if (d == 4) {
            return ":|::|";
            }
            if (d == 5) {
            return ":|:|:";
            }
            if (d == 6) {
            return ":||::";
            }
            if (d == 7) {
            return "|:::|";
            }
            if (d == 8) {
            return "|::|:";
            }
            if (d == 9) {
            return "|:|::";
            }
            if (d == 0) {
            return "||:::";
            }

            */
       
        

    }
    public static int getCheckDigit(int zipCode) {

        int checkDigit = 0;

        String newZip = Integer.toString(zipCode);

        int n1 = Integer.valueOf(newZip.charAt(0));
        int n2 = Integer.valueOf(newZip.charAt(1));
        int n3 = Integer.valueOf(newZip.charAt(2));
        int n4 = Integer.valueOf(newZip.charAt(3));
        int n5 = Integer.valueOf(newZip.charAt(4));

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
    public static void printBarCode(int zipCode) {

        String newZip = Integer.toString(zipCode);

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

        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        /* 
        String sec1 = getEncodedDigit(n1);
        String sec2 = getEncodedDigit(n2);
        String sec3 = getEncodedDigit(n3);
        String sec4 = getEncodedDigit(n4);
        String sec5 = getEncodedDigit(n5);
        String checkDigit = getEncodedDigit(getCheckDigit(zipCode));

        */

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




    