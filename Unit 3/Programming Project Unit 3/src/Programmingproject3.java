// Cole Sieper
// Programming Project 3
// 10/26/23

import java.util.Scanner;


class DoorSystem {

    /* 
    LD = Left Door -- RD = Right Door
    OH = Outside handle -- IH = Inside handle
    DB = dashboard button (to open door from drivers seat) 
    */
    Scanner in = new Scanner(System.in);

    public enum GearShift {P, N, D, ONE, TWO, THREE, R}

    // variable for inputs 
    String door_input = "000000000";

    String LDDBint = "0";
    String RDDBint = "0";
    String child_lockint = "0";
    String master_unlockint = "0";
    String LDIHint = "0";
    String RDIHint = "0"; 
    String LDOHint = "0";
    String RDOHint = "0";
    String Gear = "1";

    /* 
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
    */

    //starting gear setting
    GearShift gearShift = GearShift.P;
    
    
    // methods that change the variables values of the object
    // check if the left door is open
    // this function returns true if the left door is open.

    public boolean isLeftOpen() {
        System.out.println(door_input.substring(8,9));
        if (Gear.charAt(0) == '1') {
            if (master_unlockint.charAt(0) == '1') {
                if (LDDBint.charAt(0)=='1' || LDOHint.charAt(0)=='1') {
                    return true;
                } else {
                    if (child_lockint.charAt(0)=='0' && LDIHint.charAt(0)=='1') {
                        //System.out.println("true");
                        return true;
                    } else { 
                        //System.out.println("false");
                        return false;
                }}
            } else {return false;}
        } else {return false;}  
    }

    public boolean isRightOpen() {
        System.out.println(door_input.substring(8,9));
        if (Gear.charAt(0) == '1') {
            if (master_unlockint.charAt(0) == '1') {
                if (RDDBint.charAt(0) == '1' || RDOHint.charAt(0) == '1') {
                    return false;
                } else {
                    if (child_lockint.charAt(0) == '0' && RDIHint.charAt(0) == '1') {
                        return true;
                    } else { 
                        return false;
                }}
            } else {return false; }
        } else {return false; }
    }

    public void input() {
        
        System.out.print("Left Door Dashboard (0 = Off, 1 = On): ");
        LDDBint = in.nextLine();
        System.out.print("Right Door Dashboard (0 = Off, 1 = On): ");
        RDDBint = in.nextLine();
        System.out.print("Child Lock (0 = Off, 1 = On): ");
        child_lockint = in.nextLine();
        System.out.print("Master Unlock (0 = Off, 1 = On): ");
        master_unlockint = in.nextLine();
        System.out.print("Left Door Inside Handle (0 = Off, 1 = On): ");
        LDIHint = in.nextLine();
        System.out.print("Right Door Inside Handle (0 = Off, 1 = On): ");
        RDIHint = in.nextLine();
        System.out.print("Left Door Outside Handle (0 = Off, 1 = On): ");
        LDOHint = in.nextLine();
        System.out.print("Right Door Outside Handle (0 = Off, 1 = On): ");
        RDOHint = in.nextLine();
        System.out.print("Gear Setting ( 1 = P | 2 = N | 3 = D | 4 = 1 | 5 = 2 | 6 = 3 | 7 = R ): ");
        Gear = in.nextLine();

        

        door_input = LDDBint + RDDBint + child_lockint + master_unlockint + LDIHint + RDIHint + LDOHint + RDOHint + Gear;

        System.out.println(door_input);

    }




/* 
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
    */



}


   
public class Programmingproject3 {
    public static void main(String[] args) {

    DoorSystem Door = new DoorSystem();

        //input initl state of door input
        Door.input();

        System.out.println("Is left door open? (True/False) ");
        if (Door.isLeftOpen() == true) {
            System.out.println("True!");
        } else {System.out.println("False");}        
        
        System.out.println("Is right door open? (True/False) ");
        if (Door.isRightOpen() == true) {
            System.out.println("True!");
        } else {System.out.println("False");}        
        

    }
}