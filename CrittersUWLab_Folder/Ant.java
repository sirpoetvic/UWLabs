package CrittersUWLab_Folder;

import java.awt.*;

public class Ant extends Critter {
    public Ant(boolean walkSouth) {
        super();
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
            return Direction.CENTER;
        }
    
        public String toString() {
            return "%";
        }
    }

}
