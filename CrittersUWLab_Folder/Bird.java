package CrittersUWLab_Folder;

import java.awt.*;

public class Bird extends Critter {
    public Bird() {
        super();
        public boolean eat() {
            return false;
        }
    
        public Attack fight(String opponent) {
            if(opponent.equals("%"))
                return Attack.ROAR;
            else
                return Attack.POUNCE;
        }
    
        public Color getColor() {
            return Color.BLUE; 
        }
    
        public Direction getMove() {
            
        }
    
        public String toString() {
            return "?";
        }
    }

}
