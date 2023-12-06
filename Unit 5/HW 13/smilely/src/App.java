// Cole Sieper
// 12/4/23
// HW 13 Part A



import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;


public class App {
    


   public static void draw(Graphics g)
   {  
    
      g.setColor(Color.YELLOW);
   
      g.fillOval(0, 0, 400, 400);

      g.setColor(Color.BLACK);
      g.fillOval(80, 100, 50, 50);
      g.fillOval(270, 100, 50, 50);

      g.drawLine(50, 300, 350, 300);	
      g.drawOval(0, 0, 400, 400);

   }
   public static void main(String[] args) 
   {
      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;

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