// Cole Sieper
// Programming Project 3
// 10/20/23

class DoorSystem {

    //initializing variables of the object
    // LD = Left Door // RD = Right Door
    // OH = Outside handle // IH = Inside handle
    // DB = dashboard button (to open door from drivers seat)
    
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
    GearShift gear_setting = GearShift.P;

    
    
    //methods that change the variables values of the object
    public int isLeftOpen() {
        if (gear_setting = GearShift.P && master_unlock == "0")

        return "True";
        
    }

    public void isRightOpen() {

        return ;
    }

    public void 

   
public class App {
    public static void main(String[] args) {





    }
}}