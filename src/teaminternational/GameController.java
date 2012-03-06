package teaminternational;

public class GameController {
	final static int BEFORE = -1;
	final static int EQUAL 	= 0;
	final static int AFTER 	= 1;
	
	int round;
	Statistic stats;
	
	public void newGame(int nrRounds) {
		stats = new Statistic();	
		round = 1;
	}
	
	public Throw generateThrowFromInput(int playerChoice) {
		Throw t1 = null;
		
		if (playerChoice == 1) {
			t1 = new Rock();
		} else if (playerChoice == 2) {
			t1 = new Paper();
		} else if (playerChoice == 3) {
			t1 = new Scissor();
		} else {
			// @TODO: Fix exception and default
			t1 = new Scissor(); // Defaults to scissor
		}
		
		return t1;
	}
	
	public void endGame() {
		
	}
	
	public void setWinner(int status) {
		stats.addWinner(round, status);
		
		round++;
	}
	
	public Statistic getStats() {
		return stats;
	}
	
	
	/*
	 * @return 1 refers to Human player, 2 refers to Computer player, 3 refers to equal
	 */
	public int getWinner(Throw t1, Throw t2) {
		// Compare and calculate winner
		if (t1.compareTo(t2) == AFTER) {
			return 1;
		} else if (t1.compareTo(t2) == BEFORE) {
			return 2;
		} else {
			return 3;
		}
	}
	
}
