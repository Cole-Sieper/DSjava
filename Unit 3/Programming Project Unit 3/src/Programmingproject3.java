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
    String door_input = "00000000P";

    Boolean LDDB;
     Boolean RDDB;
     Boolean child_lock;
     Boolean master_unlock;
     Boolean LDIH;
     Boolean RDIH; 
     Boolean LDOH;
     Boolean RDOH;
     DoorSystem.GearShift gearShift = GearShift.P;

    String LDDB_in = "0";
    String RDDB_in = "0";
    String child_lock_in = "0";
    String master_unlock_in = "0";
    String LDIH_in = "0";
    String RDIH_in = "0"; 
    String LDOH_in = "0";
    String RDOH_in = "0";
    String Gear_in = "1";

    
    
    // methods that change the variables values of the object

    
    // check if the left door is open
    // this function returns true if the left door is open.

    public boolean isLeftOpen() {
        
        if (gearShift == GearShift.P) {
            if (master_unlock == true) {
                if (LDDB == true || LDOH == true) {
                    return true;
                } else {
                    if (child_lock == false && LDIH == true) {
                        return true;
                    } else { 
                        return false;
                }}
            } else {return false; }
        } else {return false; }
    }

    public boolean isRightOpen() {
        if (gearShift == GearShift.P) {
            if (master_unlock == true) {
                if (RDDB == true || RDOH == true) {
                    return true;
                } else {
                    if (child_lock == false && RDIH == true) {
                        return true;
                    } else { 
                        return false;
                }}
            } else {return false; }
        } else {return false; }
    }

    public void input() {
        
        System.out.print("Left Door Dashboard (0 = Off, 1 = On): ");
        LDDB_in = in.nextLine();
        System.out.print("Right Door Dashboard (0 = Off, 1 = On): ");
        RDDB_in = in.nextLine();
        System.out.print("Child Lock (0 = Off, 1 = On): ");
        child_lock_in = in.nextLine();
        System.out.print("Master Unlock (0 = Off, 1 = On): ");
        master_unlock_in = in.nextLine();
        System.out.print("Left Door Inside Handle (0 = Off, 1 = On): ");
        LDIH_in = in.nextLine();
        System.out.print("Right Door Inside Handle (0 = Off, 1 = On): ");
        RDIH_in = in.nextLine();
        System.out.print("Left Door Outside Handle (0 = Off, 1 = On): ");
        LDOH_in = in.nextLine();
        System.out.print("Right Door Outside Handle (0 = Off, 1 = On): ");
        RDOH_in = in.nextLine();
        System.out.print("Gear Setting ( P, N, D, 1, 2, 3, R ): ");
        Gear_in = in.nextLine();

        Gear_in.toUpperCase();
    
        door_input = LDDB_in + RDDB_in + child_lock_in + master_unlock_in + LDIH_in + RDIH_in + LDOH_in + RDOH_in + Gear_in.toUpperCase();

            // SET BOOLEANS
            if (door_input.charAt(0)=='1') {
                LDDB = true;
            } else {
                LDDB = false;
            }

            if (door_input.charAt(1)=='1') {
                RDDB = true;
            } else {
                RDDB = false;
            }

            if (door_input.charAt(2)=='1') {
                child_lock = true;
            } else {
                child_lock = false;
            }

            if (door_input.charAt(3)=='1') {
                master_unlock = true;
            } else {
                master_unlock = false;
            }

            if (door_input.charAt(4)=='1') {
                LDIH = true;
            } else {
                LDIH = false;
            }

            if (door_input.charAt(5)=='1') {
                RDIH = true;
            } else {
                RDIH = false;
            }

            if (door_input.charAt(6)=='1') {
                LDOH = true;
            } else {
                LDOH = false;
            }

            if (door_input.charAt(7)=='1') {
                RDOH = true;
            } else {
                RDOH = false;
            }

            if (door_input.charAt(8)=='P') {
                gearShift = GearShift.P;
            } else {
                gearShift = GearShift.D;
            }

            System.out.print("Your input: ");
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