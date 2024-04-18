import java.awt.EventQueue;
import animate.Application;


public class Demo {
    
    public static void main(String[] args) {
        
        //Application picture = new Application("Image B");

        
        
        // Add the Board object to the Application
        //picture.getContentPane().add(board);
        
        
        //picture.setVisible(true); // Make the Application frame visible


        /*
         * In Java, GUI related actions should be
         * performed in the AWT event thread
         * or it could cause severe problems with the GUI.
         * EventQueue.invokeLater() posts your GUI-related
         * actions in the AWT event queue to avoid causing
         * any problems with other GUI-related actions.
         */
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Title");
            myApp.setVisible(true);
        });

    }
}
