// Cole Sieper
// 12/7/23
// Programming Project 5 Project 1

import java.util.Scanner;

public class ProjectOne {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        // initialie input variables
        String num1 = "";
        String num2 = "";

        //input
    
        System.out.print("Please enter a number (ie. 1.34.2.3): ");
        num1 = in.nextLine();

        System.out.print("Please enter a second number (ie. 1.34.2.3): ");
        num2 = in.nextLine();
        
        System.out.println(whoIsFirst(num1, num2)+" is first");
        
    }

    public static int leadingNumber(String section) {

        int i = section.indexOf('.');

        String chopped = section.substring(0, i);

        int leadingNum = Integer.valueOf(chopped);

        return leadingNum;

        }

    
    

    public static String truncateSection(String section) {

        int i = section.indexOf('.');

        String chopped = section.substring(i);

        String truncateNum = chopped;

        return truncateNum;


    }

    public static String whoIsFirst(String section1, String section2) {

        String w1 = section1;
        String w2 = section2;

        int n1;
        int n2;

        while (true) {

            n1 = leadingNumber(section1);
            n2 = leadingNumber(section2);
            if (n1 < n2) {
                return section1;
            } else {if (n1 > n2) {
                return section2;
            } else {
                truncateSection(w1);
                truncateSection(w2);
            if (w1.length()==0) {
                 return section1;
            } else {
                return section2;
            }}}}

            
    }



}
