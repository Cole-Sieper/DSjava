// Cole Sieper
// 12/6/23
// AT HW 8

 class Die {

    int dieFace;

    //initialize the dice   
    public Die() {

        dieFace = 1;

    }

    public Die(int initalFace) {

        if (initalFace > 0 && initalFace < 7) {
        dieFace = initalFace;
        } else { dieFace = 1;}

    }


    public int checkSide() {

        return dieFace;


    }

    public void setSide(int newSide) {

        if (newSide > 0 && newSide < 7) {
        dieFace = newSide;
    
        
        } else {
            System.out.println(" Die must be between 1-6");
        }

    }


    public void rollDie() {
        int roll =0;
        roll = (int) (Math.random() * 6) + 1;
        
        if (roll==1) {
        System.out.println("+-------+");
        System.out.println("|       |");
        System.out.println("|   *   |");
        System.out.println("|       |");
        System.out.println("+-------+");
        }
        if (roll==2) {
        System.out.println("+-------+");
        System.out.println("| *     |");
        System.out.println("|       |");
        System.out.println("|     * |");
        System.out.println("+-------+");
        }
        if (roll==3) {
        System.out.println("+-------+");
        System.out.println("| *     |");
        System.out.println("|   *   |");
        System.out.println("|     * |");
        System.out.println("+-------+");
        }
        if (roll==4) {
        System.out.println("+-------+");
        System.out.println("| *   * |");
        System.out.println("|       |");
        System.out.println("| *   * |");
        System.out.println("+-------+");
        }
        if (roll==5) {
        System.out.println("+-------+");
        System.out.println("| *   * |");
        System.out.println("|   *   |");
        System.out.println("| *   * |");
        System.out.println("+-------+");
        }
        if (roll==6) {
        System.out.println("+-------+");
        System.out.println("| *   * |");
        System.out.println("| *   * |");
        System.out.println("| *   * |");
        System.out.println("+-------+");
        }



    }

 }




public class DieRollTwo {
    public static void main(String[] args) throws Exception {
        
        Die die = new Die();

        die.rollDie();



    }
}
