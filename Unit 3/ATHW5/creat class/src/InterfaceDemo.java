interface Submarine {
    public int getDepth();
    public double getSpeed();

    public void dive();
    public void surface();

    public void speedUp();
    public void slowDown();
}

class NuclearSubmarine implements Submarine { 
    final int MAX_DEPTH = 500;
    int depth = 0;
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
            depth = depth + 10;
    }}

    public void surface() {
        // surface if possible.
        if (depth > 0) {
            depth = depth - 10;
    }}

    public void speedUp() {
        speed = speed + 10;
    }

    public void slowDown() {
        if (speed > 10.0) {
            speed = speed - 10;
        }
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // create an object using the Nuclear Submarine class.
        NuclearSubmarine NSub = new NuclearSubmarine();

        // what's the initial state?
        System.out.printf("depth = %d, speed = %.2f%n", NSub.getDepth(), NSub.getSpeed());

        // speed up  a little and decrease depth
        for(int i = 0; i < 3; i++) {
            System.out.println("Speedig up and diving");
            NSub.speedUp();
            System.out.printf("depth = %d, speed = %.2f%n", NSub.getDepth(), NSub.getSpeed());
            NSub.dive();
        }
    }
}