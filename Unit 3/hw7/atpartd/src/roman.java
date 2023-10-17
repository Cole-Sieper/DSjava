// Roman Numeral AT HW
// Cole Sieper
// 10/17/23



import java.util.Scanner; //importing the scanner
public class roman {
    
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in); 

        //variables fro recording  how many of each type there is
        int firstinput = 0; //number inpt by the user
        int digit = 0; //variable fro all division and sorting
        int num1 = 0;
        int num10 = 0;
        int num100 = 0;
        int num1000 = 0;


        //initialize string variables for end text
        String onetext = "";
        String tentext = "";
        String huntext = "";
        String thoutext = "";
    
        //initialize value of each letter numberal
        final int I = 1;
        final int V = 5;
        final int X = 10;
        final int L = 50;
        final int C = 100;
        final int D = 500;
        final int M = 1000;
        
    
        //input number from user
        System.out.print("Input a number (less than 4000): "); 
        firstinput = in.nextInt();

        digit = firstinput;

        //converting the value and sorting
            //measures how many thousands, hundred, tens and ones are in each place after divinging remainder.
            if (digit > 999) {
                num1000 = digit / 1000;
                digit = digit % 1000;
                num100 = digit / 100;
                digit = digit % 100;
                num10 = digit / 10;
                digit = digit % 10;
                num1 = digit / 1;
            }
            else {
                
                if (digit > 99) {
                    num1000 = 0;
                    num100 = digit / 100;
                    digit = digit % 100;
                    num10 = digit / 10;
                    digit = digit % 10;
                    num1 = digit / 1;
                } else { 

                    if (digit > 9) {

                        num1000 = 0;
                        num100 = 0;
                        num10 = digit / 10;
                        digit = digit % 10;
                        num1 = digit / 1;

                    } else {

                        num1000 = 0;
                        num100 = 0;
                        num10 = 0;
                        num1 = digit / 1;
                    }
                }
            }

            // takes the numer of thousends, hundreds, etc and turns it roman numerals.

            if (num1000 == 3) { thoutext = "MMM";}
            if (num1000 == 2) { thoutext = "MM";}
            if (num1000 == 1) { thoutext = "M";}
            if (num100 == 9)  { huntext = "CM";}
            if (num100 == 8)  { huntext = "DCCC";}
            if (num100 == 7)  { huntext = "DCC";}
            if (num100 == 6)  { huntext = "DC";}
            if (num100 == 5)  { huntext = "D";}
            if (num100 == 4)  { huntext = "CD";}
            if (num100 == 3)  { huntext = "CCC";}
            if (num100 == 2)  { huntext = "CC";}
            if (num100 == 1)  { huntext = "C";}
            if (num10 == 9)  { tentext = "XC";}
            if (num10 == 8)  { tentext = "LXXX";}
            if (num10 == 7)  { tentext = "LXX";}
            if (num10 == 6)  { tentext = "LX";}
            if (num10 == 5)  { tentext = "L";}
            if (num10 == 4)  { tentext = "XL";}
            if (num10 == 3)  { tentext = "XXX";}
            if (num10 == 2)  { tentext = "XX";}
            if (num10 == 1)  { tentext = "X";}
            if (num1 == 9)  { onetext = "IX";}
            if (num1 == 8)  { onetext = "VIII";}
            if (num1 == 7)  { onetext = "VII";}
            if (num1 == 6)  { onetext = "VI";}
            if (num1 == 5)  { onetext = "V";}
            if (num1 == 4)  { onetext = "IV";}
            if (num1 == 3)  { onetext = "III";}
            if (num1 == 2)  { onetext = "II";}
            if (num1 == 1)  { onetext = "I";}



            //outputs
            if (firstinput > 3999) { 
                System.out.println("Number Not Allowed! Try again");
            } else{
                System.out.println("-----");
                System.out.println("Roman Numberal Form: ");
                System.out.println(thoutext+huntext+tentext+onetext); 
                //prints out each number plcae in roman numeral
            }
            
    }

}