package CrittersUWLab_Folder;

import java.awt.*;

public class Bird extends Critter {
    private Direction d;
    private int steps;
    private Direction lastMove = Direction.NORTH;

    public Bird() {
        super();
    }

    //Method returns if Bird is going to eat (always false)
    public boolean eat() {
        return false;
    }

    //Method returns an attack
    public Attack fight(String opponent) {
        if(opponent.equals("%"))
            return Attack.ROAR;
        else
            return Attack.POUNCE;
    }

    //Method returns color of Bird (always blue)
    public Color getColor() {
        return Color.BLUE; 
    }

    //Gets movement for Bird
    public Direction getMove() {
        if(steps % 12 < 3) {
            steps++;
            lastMove = Direction.NORTH;
            return Direction.NORTH;
        }
        else if(steps % 12 < 6) {
            steps++;
            lastMove = Direction.EAST;
            return Direction.EAST;
        }
        else if(steps % 12 < 9) {
            steps++;
            lastMove = Direction.SOUTH;
            return Direction.SOUTH;
        }
        else {
            steps++;
            lastMove = Direction.WEST;
            return Direction.WEST;
        }

    }

    //Method gives depiction of Bird on GUI
    public String toString() {
        if (lastMove.equals(Direction.NORTH))
            return "^";
        else if (lastMove.equals(Direction.EAST))
            return ">";
        else if (lastMove.equals(Direction.SOUTH))
            return "V";
        else
            return "<";
    }
}
