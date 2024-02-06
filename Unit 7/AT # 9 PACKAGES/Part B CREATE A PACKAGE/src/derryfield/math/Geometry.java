package derryfield.math;


public class Geometry {
     // Method to calculate the volume of a sphere
     public static double calcVolSphere(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    // Method to calculate the surface area of a sphere
    public static double calcSurfSphere(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }
}
