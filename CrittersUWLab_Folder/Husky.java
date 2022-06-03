package CrittersUWLab_Folder;

import java.awt.*;

public class Husky extends Critter {
    public Husky() {
        super();
    }
    public boolean eat() {
		return true;
	}

	public Attack fight(String opponent) {
		return Attack.SCRATCH;
	}

	public Color getColor() {
		return Color.ORANGE;
	}

	public Direction getMove() {
		return Direction.CENTER;
	}

	public String toString() {
		return "!";
	}
}
