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
    public boolean eat() {
        return true;
    }

    public Attack fight(String opponent) {
        return Attack.SCRATCH;
    }

    public Color getColor() {
        return Color.RED;
    }

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

    public String toString() {
        return "%";
    }
}
