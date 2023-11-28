// Cole Sieper
// 11/28/23
// Java HW 11 Part C




import java.util.Scanner;

public class HW11PartC {
    
    public static void main(String[] args) throws Exception {

        //variables
        double input = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter in the Sphere's Radius: ");
        input= in.nextDouble();

        System.out.println("Sphere Volume: "+sphereVolume(input));

    }
        
    public static double sphereVolume(double radius){

        double volume = (4/3) * Math.PI * Math.pow(radius, 3); 
        return volume;


        }








}

