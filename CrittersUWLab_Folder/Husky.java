package CrittersUWLab_Folder;

import java.awt.*;

public class Husky extends Critter {
    public Husky() {
        super();
    }

	//Always eats
    public boolean eat() {
		return true;
	}

	//Always scratches
	public Attack fight(String opponent) {
		return Attack.SCRATCH;
	}

	//Always orange
	public Color getColor() {
		return Color.ORANGE;
	}

	//Doesn't move
	public Direction getMove() {
		return Direction.CENTER;
	}

	//Depicted as ! on GUI
	public String toString() {
		return "!";
	}
}
