public class GearedBicycle extends Bicycle {

    private int gear;
    private int speed;
    private final int MAX_GEAR = 6;
    private final int MIN_GEAR = 1;
    private final int MAX_SPEED = 50;
    

    /*
        Geared bicycles have 6 different mechanical gears that the cyclist can use
        A cyclist can get the current gear
        A cyclist can set the current gear
        A cyclist can shift up (and move from the current gear to the higher gear)
        A cyclist can shift down (and move from the current gear to the lower gear)
     */

     public GearedBicycle () {
        gear = 1;
        speed = 0;
     }

     public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

     public int getGear () {
        return gear;
     }

     public void setGear (int newGear) {
        if (newGear >= MIN_GEAR && newGear <= MAX_GEAR)
            gear = newGear;
     }

     public void shiftUp () {
        if (gear < MAX_GEAR)
        gear = gear +1;
     }
    
     public void shiftDown () {
        if (gear > MIN_GEAR) 
        gear = gear - 1;
     }

     public void pedal () {
        speed = speed + (1 * gear);
        if (speed > MAX_SPEED) {
            speed = MAX_SPEED;
        }
     }

     // overide brake method to slow down twice as fast (2 instead of 1)
     public void brake () {
        speed = speed - (2 * gear);
        if (speed < 0) {
            speed = 0;
        }
     }


}
