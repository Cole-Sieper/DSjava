//Dialog box assignment
//Cole Sieper
//10/1/23

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    


        String n_apples = javax.swing.JOptionPane.showInputDialog("Total  # of apples: ");

        String a_per_pie = javax.swing.JOptionPane.showInputDialog("Enter # of apples per apple pie: ");

        int pies = Integer.parseInt(n_apples) / Integer.parseInt(a_per_pie);

        JOptionPane.showMessageDialog(null,"You can make "+ pies +" "+"pies!");
    }

    
}
