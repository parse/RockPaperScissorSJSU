package teaminternational;

import java.util.Random;

public class Human extends Player {
	public Throw getThrow() {
		Random random = new Random();
		int pick = random.nextInt(3);
		
		if (pick == 0) {
			return new Rock();
		} else if (pick == 1) {
			return new Paper();
		} else if (pick == 2) {
			return new Scissor();
		} else {
			return new Scissor(); // To get rid of warning
		}
	}

	public String toString() {
		return "Human player";
	}
}
