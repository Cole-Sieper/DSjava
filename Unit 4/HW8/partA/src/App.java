// Cole Sieper
// 10/30/23
// HW 8 Part 8


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        //create variables
        double cesium = 100;
        int year = 0;

        //create loop for degrading cesium
        while (cesium > 1) {

            cesium = cesium / 2;
            year = year + 30;

        }

        //if statement to print number of years when the cesium is at or below 1% power
        if (cesium <= 1) {
            System.out.println("It took "+year+" years for the cesium to degrade to 1%");
        }


        
    }
}
