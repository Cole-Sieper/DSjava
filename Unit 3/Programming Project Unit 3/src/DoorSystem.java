// Cole Sieper
// Programming Project 3
// 10/26/23

import java.util.Scanner;

interface VanDoor {

    public String isLeftOpen();
    public String isRightOpen();
    
}


class DoorSystem implements VanDoor{

    /* 
    LD = Left Door -- RD = Right Door
    OH = Outside handle -- IH = Inside handle
    DB = dashboard button (to open door from drivers seat) 
    */
    
    public enum GearShift {P, N, D, ONE, TWO, THREE, R}

    // variable for inputs 
    String door_input = "00000000P";

    // following order of inputs (0 = Off, 1 = On)
    String LDDB = door_input.substring(0,1);
    String RDDB = door_input.substring(1,2);
    String child_lock = door_input.substring(2,3);
    String master_unlock = door_input.substring(3,4);

    //inside and outside handles
    String LDIH = door_input.substring(4,5);
    String RDIH = door_input.substring(5,6);
    String LDOH = door_input.substring(6,7);
    String RDOH = door_input.substring(7,8);

    //starting gear setting
    GearShift gearShift = GearShift.P;
    
    
    // methods that change the variables values of the object
    // check if the left door is open

    public String isLeftOpen() {
        if ("P" == door_input.substring(8, 9)) {
            if (master_unlock == "1") {
                if (LDDB == "1" || LDOH == "1") {
                    return "true";
                } else {
                    if (child_lock == "0" && LDIH == "1") {
                        return "true";
                    } else { 
                        return "false";
                }}
            } else {return "false";}
        } else {return "false";}  
    }

    public String isRightOpen() {
    if ("P" == door_input.substring(8, 9)) {
            if (master_unlock == "1") {
                if (RDDB == "1" || RDOH == "1") {
                    return "true";
                } else {
                    if (child_lock == "0" && RDIH == "1") {
                        return "true";
                    } else { 
                        return "false";
                }}
            } else {return "false";}
        } else {return "false";}
    }

    public void input() {
         


    }

    public void shiftUp() {
        if ("P" == door_input.substring(8, 9)) {
            gearShift = GearShift.N;
        }
        if ("N" == door_input.substring(8, 9)) {
            gearShift = GearShift.D;
        }
        if ("D" == door_input.substring(8, 9)) {
            gearShift = GearShift.ONE;
        }
        if ("ONE" == door_input.substring(8, 9)) {
            gearShift = GearShift.TWO;
        }
        if ("TWO" == door_input.substring(8, 9)) {
            gearShift = GearShift.THREE;
        }
        if ("THREE" == door_input.substring(8, 9)) {
            gearShift = GearShift.R;
        }
    }

    public void shiftDown() {
        if ("N" == door_input.substring(8, 9)) {
            gearShift = GearShift.P;
        }
        if ("D" == door_input.substring(8, 9)) {
            gearShift = GearShift.N;
        }
        if ("ONE" == door_input.substring(8, 9)) {
            gearShift = GearShift.D;
        }
        if ("TWO" == door_input.substring(8, 9)) {
            gearShift = GearShift.ONE;
        }
        if ("THREE" == door_input.substring(8, 9)) {
            gearShift = GearShift.TWO;
        }
        if ("R" == door_input.substring(8, 9)) {
            gearShift = GearShift.THREE;
    }
    



}


   
public class App {
    public static void main(String[] args) {





    }
}