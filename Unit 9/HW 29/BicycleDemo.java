

public class BicycleDemo {

   public static void print(Bicycle b) {
        System.out.printf("Speed = %02d MPH%n", b.getSpeed());
    }

    public static void main(String[] args) {
        Bicycle colesBicycle = new Bicycle();
        colesBicycle.pedal();
        colesBicycle.pedal();
        System.out.print("Cole's bike: ");
        print(colesBicycle);

        GearedBicycle davidsBicycle = new GearedBicycle();
        davidsBicycle.shiftUp();
        davidsBicycle.pedal();
        davidsBicycle.pedal();
        System.out.print("David's bike: ");
        print(davidsBicycle);
        System.out.println("current gear = " + davidsBicycle.getGear());

        System.err.println();
        System.out.println("----- BRAKING TEST -----");
        System.out.println();

        colesBicycle.brake();
        System.out.print("Cole's bike: ");
        print(colesBicycle);

        davidsBicycle.brake();
        System.out.print("David's bike: ");
        print(davidsBicycle);
        System.out.println("current gear = " + davidsBicycle.getGear());
    }
}


