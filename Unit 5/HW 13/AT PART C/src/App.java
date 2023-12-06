// Cole Sieper
// 12/5/23
// HW 13 Part C

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class App {

   public static void draw(Graphics g) {

      g.setColor(Color.BLACK);

      final int STEPS = 1000;

      double delta = 2 * Math.PI / STEPS;

      double theta = 0;
      int scale = 150;

      for (int i = 0; i <= STEPS; i++) {

         theta = theta + delta;

         double r = Math.cos(2 * theta);

         double y = scale * r * Math.sin(theta);
         double x = scale * r * Math.cos(theta);

         int plotY = (int) y + 199;
         int plotX = (int) x + 199;

         g.drawOval(plotX, plotY, 1, 1);

      }

   }

   public static void main(String[] args) {
      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;

      JFrame frame = new JFrame();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JComponent component = new JComponent() {
         public void paintComponent(Graphics graph) {
            draw(graph);
         }
      };

      frame.add(component);
      frame.setVisible(true);
   }
}