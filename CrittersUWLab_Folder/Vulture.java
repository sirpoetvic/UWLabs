package CrittersUWLab_Folder;

import java.awt.*;

public class Vulture extends Critter {
    private boolean hungry;
    private boolean timeToEat = true;
    private int steps;
    private Direction lastMove = Direction.NORTH;

    public Vulture() {
        super();
    }

    //Method returns if Vulture is going to eat
    public boolean eat() {
        if (timeToEat) {
            timeToEat = false;
            return true;
        } else
            return false;
    }

    //Method returns an attack based on opponent
    public Attack fight(String opponent) {
        timeToEat = true;
        if (opponent.equals("%")) {
            return Attack.ROAR;
        } else {
            return Attack.POUNCE;
        }
    }

    //Method returns color of Vulture (always black)
    public Color getColor() {
        return Color.BLACK;
    }

    //Gets movement for Vulture
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

    //Method gives depiction of Vulture on GUI
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
