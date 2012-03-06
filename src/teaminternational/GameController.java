package teaminternational;

public class GameController {
	final static int BEFORE = -1;
	final static int EQUAL 	= 0;
	final static int AFTER 	= 1;
	
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
