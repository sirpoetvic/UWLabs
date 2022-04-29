//Victor Wong 
//April 6th, 2022
//CSE142
//TA: TA Name
//Take-Home Assessment #3, Part A
//
//This program is intended to produce a cube and on the primary side shown
//to the user, a circle and triangle are produced. This program
//depicts accurate ability of use of a GUI (Graphical User Interface)
package UWLabs.CafeWallUWLab_Folder;
import java.awt.*;
public class PartA {
      public static void main(String[] args) {
        DrawingPanel draw = new DrawingPanel(1000, 1000);
        Graphics graphics = draw.getGraphics();
        //triangle
        //3 pts
        //(600, 400), (450, 100), (400, 400)
        graphics.setColor(Color.ORANGE);
        graphics.drawLine(600, 400, 300, 400);
        graphics.drawLine(600, 400, 450, 100);
        graphics.drawLine(450, 100, 300, 400);

        //other lines that make the cube
        graphics.setColor(Color.RED);
        graphics.drawLine(600, 100, 700, 0);
        graphics.drawLine(300, 100, 400, 0);
        graphics.drawLine(700, 0, 400, 0);
        graphics.drawLine(600, 400, 700, 300);
        graphics.drawLine(700, 0, 700, 300);

        //circle, top left corner in (300, 100)
        graphics.setColor(Color.GREEN);
        graphics.drawOval(300, 100, 300, 300);

        

        //square, top left corner in (300, 100)
        graphics.setColor(Color.BLUE);
        graphics.drawRect(300, 100, 300, 300);


        
      }

    
}
