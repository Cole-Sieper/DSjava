// Cole Sieper
// 1/25/24
// HW 19 PART B QUIZ SCORES



import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        
        File inputFile = new File("quizzes.txt");
        Scanner in = new Scanner(inputFile);

        ArrayList<Double> quizzes = new ArrayList<Double>();

        File outputFile = new File("quizzesMOD.txt");
        PrintWriter out = new PrintWriter(outputFile);
        // variables

       
        
       
        
        // scan values
        while (in.hasNext()) {

            Double value = in.nextDouble();
            quizzes.add(value);

        }
        
        double total = 0;
        double average = 0;


        // find average

        for (int i = 0; i < quizzes.size(); i++) {

            total = total + quizzes.get(i);

            if ( i == quizzes.size()-1) 
                average = total / (quizzes.size()-1);
        

          
            
        }

        // output loop

        for (int i = 0; i < quizzes.size(); i++) {

            int quizNum = i + 1;

            System.out.printf("Quiz %03d: %3.2f%n", quizNum, quizzes.get(i));
            
            if ( i == quizzes.size()-1) {
            System.out.println("----------------");
            System.out.printf("Average: %3.2f%n", average);
            }





        }



            in.close();














    }
}
