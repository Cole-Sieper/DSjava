// Cole Sieper
// 12/4/23
// HW 13 part B


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;


public class Checkered
{  
   public static void draw(Graphics g)
   {  
      final int width = 100;
      g.setColor(Color.BLUE);

      // Top row. 
      int x = 0;
      int y = 0;
      for (int i = 0; i < 2; i++)
      {
         g.fillRect(x, y, width, width);
         x = x + 2 * width;
         
      }
      // Second row, offset from the first one
      x = width;
      y = width;
      for (int i = 0; i < 2; i++)
      {
         g.fillRect(x, y, width, width);
         x = x + 2 * width;
      }
      // third row
      x = 0;
      y = 200;
      for (int i = 0; i < 2; i++)
      {
         g.fillRect(x, y, width, width);
         x = x + 2 * width;
      }
      // fourth row, offset from the third one
      x = width ;
      y = 300;
      for (int i = 0; i < 2; i++)
      {
         g.fillRect(x, y, width, width);
         x = x + 2 * width;
      }

      // red spots
      g.setColor(Color.RED);

      x = 100;
      y = 0;
      for (int i = 0; i < 2; i++)
      {
         g.fillRect(x, y, width, width);
         x = x + 2 * width;
         
      }
      // Second row, offset from the first one
      x = 0;
      y = 100;
      for (int i = 0; i < 2; i++)
      {
         g.fillRect(x, y, width, width);
         x = x + 2 * width;
      }
      // third row
      x = 100;
      y = 200;
      for (int i = 0; i < 2; i++)
      {
         g.fillRect(x, y, width, width);
         x = x + 2 * width;
      }
      // fourth row, offset from the third one
      x = 0;
      y = 300;
      for (int i = 0; i < 2; i++)
      {
         g.fillRect(x, y, width, width);
         x = x + 2 * width;
      }

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