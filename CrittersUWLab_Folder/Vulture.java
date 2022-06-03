package CrittersUWLab_Folder;

import java.awt.*;

public class Vulture extends Critter {
    private boolean hungry;
    private boolean timeToEat = true;
    private Direction lastMove = Direction.NORTH;
    public Vulture() {
        super();
    }
        public boolean eat() {
            if(timeToEat) {
                timeToEat = false;
                return true;
            }
            else
                return false;
        }
    
        public Attack fight(String opponent) {
            if(opponent.equals("%")) {
                timeToEat = true;
                return Attack.ROAR;
            }
            else {
                timeToEat = true;
                return Attack.POUNCE;
            }
        }
    
        public Color getColor() {
            return Color.BLACK;
        }
    
        public Direction getMove() {
            return Direction.CENTER;
        }
    
        public String toString() {
            if(lastMove.equals(Direction.NORTH))
                return "^";
            else if(lastMove.equals(Direction.EAST))
                return ">";
            else if(lastMove.equals(Direction.SOUTH))
                return "V";
            else
                return "<";
        }
}
