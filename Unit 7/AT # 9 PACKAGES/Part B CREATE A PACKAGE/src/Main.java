import derryfield.math.Geometry;

public class Main {
    
    public static void main(String[] args) {
        double radius = 5.0;

        

        // Calculate volume
        double volume = Geometry.calcVolSphere(radius);
        System.out.println("Volume of sphere with radius " + radius + " is: " + volume);

        // Calculate surface area
        double surfaceArea = Geometry.calcSurfSphere(radius);
        System.out.println("Surface area of sphere with radius " + radius + " is: " + surfaceArea);

        
    }
}
