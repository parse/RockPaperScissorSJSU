package teaminternational;

import java.util.ArrayList;
import java.util.Iterator;


public class Statistic {
	ArrayList<Integer> statArray = new ArrayList<Integer>();
	
	public Statistic() { }
	
	public void addWinner(int round, int winner) {
		System.out.println(round + " => "+ winner);
		statArray.add(winner);
	}
	
	public String toString() {		
		// using traditional for loop with iterator
		int round = 1;
		for(Iterator<Integer> i = statArray.iterator(); i.hasNext();)
		{
			int winner = i.next();
			if (winner == 1) {
				System.out.println("Round " + round + " was won by the human player");
			} else if (winner == 2) {
				System.out.println("Round " + round + " was won by the computer");
			} else {
				System.out.println("Round " + round + " was draw");
			}

			round++;
		}
		return null;
		
	}
}
