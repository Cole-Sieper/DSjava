import java.util.Scanner;

public class box {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        //initilizing each variable
        double l =0;
        double w =0;
        double h =0;

        //inputs 
        System.out.println("Please enter in the length (cm): ");
        l = in.nextDouble();

        System.out.println("Please enter in the Width (cm): ");
        w = in.nextDouble();

        System.out.println("Please enter in the Height (cm): ");
        h = in.nextDouble();

        //----calculations---
         //(SA)=2 lw+ 2 lh+ 2 hw
        double sarea = (2*(l*w))+(2*(l*h))+(2*(h*w));

        double volume = l*w*h;

        //outputs
        System.out.println("-----Outputs-----");
        System.out.printf("Length (cm)       = %9.2f%n", l);
        System.out.printf("Width (cm)        = %9.2f%n", w);
        System.out.printf("Height (cm)       = %9.2f%n", h);
        System.out.printf("Surface Area (cm) = %9.2f%n", sarea);
        System.out.printf("Volume (cm)       = %9.2f%n", volume);
       



    }
}
