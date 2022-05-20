//Victor Wong 
//April 8th, 2022
//CSE142
//TA: TA Name
//Take-Home Assessment #3, Part B
//
//This program is intended to produce a depiction of the "Cafe Wall" illusion
//in the DrawingPanel GUI.
package UWLabs.CafeWallUWLab_Folder;
import java.awt.*;
public class PartB {
    //static objects for DrawingPanel GUI
    static DrawingPanel draw = new DrawingPanel(650, 400);
    static Graphics graphics = draw.getGraphics();
    //MORTAR can be changed to make the gaps between rows larger or smaller
    static final int MORTAR = 2;
    public static void main(String[] args) {
        //set background to gray
        draw.setBackground(Color.GRAY);

        //int sideLen, int x, int y, int rowLen <--- Makes a row
        //int offSet, int numRowPairs, int sideLen, int x, int y <--- Makes a grid

        //produce row A
        rowMaker(20, 0, 0, 4);
        //produce row B
        rowMaker(30, 50, 70, 5);
        //produce grid C
        gridMaker(35, 2, 35, 400, 20);
        //produce grid D
        gridMaker(0, 4, 25, 10, 150);
        //produce grid E
        gridMaker(10, 3, 25, 250, 200);
        //produce grid F
        gridMaker(10, 5, 20, 425, 180);

    }

    //Makes a row based on sidelength, x, y, and the length of the row
    //Parameter sideLen: sidelength of individual squares
    //Parameter x: x of the start position (top left)
    //Parameter y: y of the start position (top left)
    //Parameter rowLen: length of the row made
    public static void rowMaker(int sideLen, int x, int y, int rowLen) {
        for(int i = 0; i < rowLen; i++) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x, y, sideLen, sideLen);
            graphics.setColor(Color.BLUE);
            graphics.drawLine(x, y, x + sideLen, y + sideLen);
            graphics.drawLine(x + sideLen, y, x, y + sideLen);
            graphics.setColor(Color.WHITE);
            graphics.fillRect(x + sideLen, y, sideLen, sideLen);
            //Moves x to next position to draw squares
            x += sideLen * 2;
        }
    }
    
    //Makes a grid using rowMaker method using offset, mortar, the number of row pairs, and
    //parameters used from rowMaker, excluding rowLen
    //Parameter offSet: shift on even numbered blocks
    //Parameter numRowPairs: number of row pairs
    public static void gridMaker(int offSet, int numRowPairs, int sideLen, int x, int y) {
        //loops through however many times required to draw number of rows
        for(int k = 0; k < numRowPairs; k++) {
            //draws a row without offset
            for(int i = 0; i < 1; i++) {
                rowMaker(sideLen, x, y, numRowPairs);
                //changes y to make for gaps between rows
                y += MORTAR;
                //updates y to new position for next row to be drawn
                y += sideLen;
            }
            
            //draws a row with offset
            for(int j = 0; j < 1; j++) {
                rowMaker(sideLen, x + offSet, y, numRowPairs);
                //changes y to make for gaps between rows
                y += MORTAR;
                //updates y to new position for next row to be drawn
                y += sideLen;
            }
        }
    }



}
