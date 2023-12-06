// Cole Sieper
// 12/5/23
// HW 13 Part C



import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;


public class App {


    


   public static void draw(Graphics g)
   {  

   g.setColor(Color.BLACK);

  
    for (int steps = 0;steps <= 1000; steps++) {

         int scale = 150;

        double delta = 2*Math.PI;

        double theta = (delta/steps);

        double r = Math.cos(2*theta);
        
        double y = scale * r * Math.sin(theta);
        double x = scale * r * Math.cos(theta);

        int plotY = (int)y;
        int plotX = (int)x;

        g.drawOval(plotX, plotY, 1, 1);


         


    }
      


   }
   public static void main(String[] args) 
   {
      final int FRAME_WIDTH = 500;
      final int FRAME_HEIGHT = 500;

      JFrame frame = new JFrame();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JComponent component = new JComponent()
         {
            public void paintComponent(Graphics graph)
            {
               draw(graph);
            }
         };
      
      frame.add(component);
      frame.setVisible(true);
   }   
}