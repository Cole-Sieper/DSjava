class Submarine {
    final int MAX_DEPTH = 200;
    int depth = 1;
    double speed = 0.0;

    public int getDepth() {
        return depth;
    }

    public double getSpeed() {
        return speed;
    }

    public void dive() {
        // increase the depth if possible.
        if (depth < MAX_DEPTH) {
            depth = depth + 50;
        }
    }

    public void surface() {
        // decrease the depth if possible.
        if (depth > 150) {
            depth = depth - 100;
        }
    }

    public void engine() {
        speed = speed + depth * 1;
    }

    public void stop() {
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
            bike.pedal();
            System.out.printf("gear = %d, speed = %.2f%n", Sub.getDepth(), Sub.getSpeed());
            Sub.diving();
        }
    }
}

