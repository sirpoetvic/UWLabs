package CrittersUWLab_Folder;

import java.awt.*;
import java.util.Random;

public class Hippo extends Critter {
    private int steps = 0;
    private int hunger;
    private boolean hungry;

    public Hippo(int hunger) {
        super();
        this.hunger = hunger;
    }

        public boolean eat() {
            if(hunger > 0) {
                hunger--;
                return true;
            }
            else
                return false;
        }
    
        public Attack fight(String opponent) {
            if(hungry)
                return Attack.SCRATCH;
            else
                return Attack.POUNCE;

                
        }
    
        public Color getColor() {
            if(hungry)
                return Color.GRAY;
            else
                return Color.WHITE;
        }
    
        public Direction getMove() {
            Random r = new Random();
            if (r > 5) {
                
            }

        }
    
        public String toString() {
            return "" + hunger;
        }
}
