// Cole Sieper
// 2/22/24
// HW 24 Part B

import java.util.Scanner;

class Counter {

    private int count = 0;

public int getValue() {
    return count;
}

public void count() {
    count = count + 1;
}

public void reset() {
    count = 0;
}



}


public class PartB {
    

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Counter cake = new Counter();
        Counter pie = new Counter();

        System.out.println("C = Cake   P = Pie   Q = quit input");

        while (true) {

            System.out.print("Please enter a letter to add to the tally (Q to quit): ");
            String input = in.nextLine();
            input = input.substring(0,1);
            if (input.equalsIgnoreCase("q"))  {
                break;
            } else {
                if (input.equalsIgnoreCase("c")) {
                    cake.count(); 
                    } else {
                        if (input.equalsIgnoreCase("p")) {
                        pie.count();
                            } else {
                                System.out.println("Input in valid (Only C, P, and Q are allowed) ");
                            }
                }
                
            }   
        }
        
        System.out.println("There are "+cake.getValue()+" total cakes");
        System.out.println("There are "+pie.getValue()+" total pies");
        
    }
}
