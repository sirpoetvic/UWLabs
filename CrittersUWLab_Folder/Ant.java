package CrittersUWLab_Folder;

import java.awt.*;

public class Ant extends Critter {
    private boolean north = true;
    private Direction d;
    //Ant constructor takes in walkSouth to decide if movement
    //alternates between north/east or south/east
    public Ant(boolean walkSouth) {
        super();
        if(walkSouth) {
            north = false;
            d = Direction.SOUTH;
        }
        else
            d = Direction.NORTH;
    }
    //Method returns if Ant is going to eat (always true)
    public boolean eat() {
        return true;
    }

    //Method returns an attack
    public Attack fight(String opponent) {
        return Attack.SCRATCH;
    }

    //Method returns color of Ant (always red)
    public Color getColor() {
        return Color.RED;
    }

    //Gets movement for Ant
    public Direction getMove() {
        if(d.equals(Direction.SOUTH)) {
            d = Direction.EAST;
            return Direction.SOUTH;
        }
        else if(d.equals(Direction.EAST) && north) {
            d = Direction.NORTH;
            return Direction.EAST;
        }
        else if(d.equals(Direction.EAST)) {
            d = Direction.SOUTH;
            return Direction.EAST;
        }
        else {
            d = Direction.EAST;
            return Direction.NORTH;
        }
    }

    //Method gives depiction of Ant on GUI
    public String toString() {
        return "%";
    }
}
