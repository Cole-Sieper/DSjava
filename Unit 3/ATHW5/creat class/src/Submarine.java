class Submarine {

    //initializing variables of the object
    final int MAX_DEPTH = 200;
    int depth = 10;
    double speed = 0.0;

    //methods that change the variables values of the object
    public int getDepth() {
        return depth;
    }

    public double getSpeed() {
        return speed;
    }

    public void dive() {
        // increase the depth if possible.
        if (depth < MAX_DEPTH) {
            depth = depth + 10;
        }
    }

    public void surface() {
        // decrease the depth if possible.
        if (depth > 150) {
            depth = depth - 10;
        }
    }

    public void speedUp() {
        speed = speed + 5;
    }

    public void slowDown() {
        if (speed > 5.0) {
            speed = speed - 5;
        }   
    }
}

public class Submarine {
    public static void main(String[] args) {
        // create an object using the Submarine class.
        Submarine Sub = new Submarine();

        // what's the initial state?
        System.out.printf("gear = %d, speed = %.2f%n", Sub.getDepth(), Sub.getSpeed());

        // increse speed a little.
        for(int i = 0; i < 3; i++) {
            System.out.println("Increasing speed and diving");
            Sub.speedup();
            System.out.printf("gear = %d, speed = %.2f%n", Sub.getDepth(), Sub.getSpeed());
            Sub.dive();
        }
    }
}

