
import java.util.Scanner;

public class App {



    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        // INITIALIZE THE ARRAY FOR 5 SPACES
        double[] VALUES = new double[5];

        // VARIABLE TO HOLD THE LARGEST NUMBER   
        double largest = 0;

        for(int i = 0; i < VALUES.length; i++) 
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

            for (int ii=0;ii<VALUES.length; ii++) 
            {
                if (VALUES[ii] == largest) {
                    System.out.println(VALUES[ii]+" <- Largest Number");
                } else {
                    System.out.println(VALUES[ii]);
                }

            }

        }




    }

