//Victor Wong 
//April 6th, 2022
//CSE142
//TA: TA Name
//Take-Home Assessment #3, Part B
//
//This program is intended to produce a depiction of the "Cafe Wall" illusion
//in the DrawingPanel GUI.  
package CafeWallUWLab_Folder;
import java.awt.*;
public class PartB {
    static DrawingPanel draw = new DrawingPanel(1000, 1000);
    static Graphics graphics = draw.getGraphics();
    static int MORTAR = 2;
    public static void main(String[] args) {
        
    }

    public static void boxPairMaker(int sideLength, int x, int y) {
        graphics.drawRect(x, y, sideLength, sideLength);
        graphics.drawLine(x, y, x + sideLength, y + sideLength);
        graphics.drawLine(x, y + sideLength, x + sideLength, y);
    }

    //generates a row of xBox and whiteBox based on parameters
    public static void rowMaker(int rowLength) {
         
    }

    public static void gridMaker() {
        //use rowMaker method
    }

}
