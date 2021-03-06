package CrittersUWLab_Folder;

import java.awt.*;
import java.util.Random;

public class Hippo extends Critter {
    private int steps = 0;
    private int hunger;
    private boolean hungry;
    private Direction lastDirection;

    public Hippo(int hunger) {
        super();
        this.hunger = hunger;
    }

    //Method returns if Hippo is hungry
    public boolean eat() {
        if(hunger > 0) {
            hunger--;
            return true;
        }
        else
            return false;
    }

    //Method returns an attack
    public Attack fight(String opponent) {
        if(hungry)
            return Attack.SCRATCH;
        else
            return Attack.POUNCE;
            
    }

    //Method returns color of Hippo
    //Gray if hungry, white if not
    public Color getColor() {
        if(hungry)
            return Color.GRAY;
        else
            return Color.WHITE;
    }

    //Gets movement for Hippo
    public Direction getMove() {
        Random r = new Random();
        int rand = r.nextInt(4) + 1;
        if(steps % 5 == 0) {
            if(rand == 0) {
                lastDirection = Direction.NORTH;
                return Direction.NORTH;
            }
            else if(rand == 1) {
                lastDirection = Direction.EAST;
                return Direction.EAST;
            }
            else if(rand == 2) {
                lastDirection = Direction.SOUTH;
                return Direction.SOUTH;
            }
            else {
                lastDirection = Direction.WEST;
                return Direction.WEST;
            }
        }

        else
            return lastDirection;
    }

    //Method gives depiction of Hippo on GUI
    public String toString() {
        return "" + hunger;
    }
}
