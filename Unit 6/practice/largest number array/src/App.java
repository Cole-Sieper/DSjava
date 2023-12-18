
import java.util.Scanner;

public class App {



    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        // INITIALIZE THE ARRAY FOR 5 SPACES
        double[] VALUES = new double[5];

        // VARIABLE TO HOLD THE LARGEST NUMBER   
        double largest = 0;
        int i = 0;

        for(i = 0; i < VALUES.length; i++) 
        {

            System.out.print("Plese enter a integer: ");
            VALUES[i] = in.nextDouble();

            if (VALUES[i] > largest || i == 0) {

                largest = VALUES[i];
                
            }
        }
            //OUTPUTS
            System.out.println("----- ------ ------");
            System.out.println("Here is your list of integers: ");

            for (i=0;i<VALUES.length; i++) 
            {
                if (VALUES[i] == largest) {
                    System.out.println(VALUES[i]+" <- Largest Number");
                } else {
                    System.out.println(VALUES[i]);
                }

            }



            double[] EPIC = {12.4,123.1,14131.2,123.4,23,211234.3}; 

            for (i = 0; i < EPIC.length; i++){
            if (i >0) {
                System.out.print(" | ");


            }
            System.out.print(EPIC[i]);
            
            }






        }


    }

