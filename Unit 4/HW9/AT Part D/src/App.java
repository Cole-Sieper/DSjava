// Cole Sieper
// 11/1/23
// HW 9 Part D

class Die {
    public int roll() {
        return (int) (Math.random() * 6) + 1;
    }

    public void display() {

        if (roll()==1) {
        System.out.println("+-------+");
        System.out.println("|       |");
        System.out.println("|   *   |");
        System.out.println("|       |");
        System.out.println("+-------+");
        }
        if (roll()==2) {
        System.out.println("+-------+");
        System.out.println("| *     |");
        System.out.println("|       |");
        System.out.println("|     * |");
        System.out.println("+-------+");
        }
        if (roll()==3) {
        System.out.println("+-------+");
        System.out.println("| *     |");
        System.out.println("|   *   |");
        System.out.println("|     * |");
        System.out.println("+-------+");
        }
        if (roll()==4) {
        System.out.println("+-------+");
        System.out.println("| *   * |");
        System.out.println("|       |");
        System.out.println("| *   * |");
        System.out.println("+-------+");
        }
        if (roll()==5) {
        System.out.println("+-------+");
        System.out.println("| *   * |");
        System.out.println("|   *   |");
        System.out.println("| *   * |");
        System.out.println("+-------+");
        }
        if (roll()==6) {
        System.out.println("+-------+");
        System.out.println("| *   * |");
        System.out.println("| *   * |");
        System.out.println("| *   * |");
        System.out.println("+-------+");
        }
    }
}





public class App {
    public static void main(String[] args) throws Exception {
        
        Die die = new Die();

        for (int i = 1; i < 7; i++) {
        die.roll();
        die.display();




        
        }

    }
}
