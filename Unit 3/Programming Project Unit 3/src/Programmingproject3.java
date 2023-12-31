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

    //check if the right door is open
    // returns true if it meets open conditions

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

    // user inputs for each of the handles etc

    public void input() {
        
        System.out.print("Input (0 = Off, 1 = On) (LDDB, RDDB, child lock, master unlock, LDIH, RDIH, LDOH, RDOH, Gear): ");
        door_input = in.nextLine();
    
        //combines all of the inputs into one string for later sorting
        door_input = door_input.toUpperCase();

            // SET BOOLEANS
            //checks each character position in the string to check the input, if on sets true
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

            //checks gear inpt if P it sets the gear setting to park
            if (door_input.charAt(8)=='P') {
                gearShift = GearShift.P;
            } else {
                gearShift = GearShift.D;
            }

            // outputs the whole string input to the user so they can see what they entered
            System.out.print("Your input: ");
            System.out.println(door_input);

    }





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