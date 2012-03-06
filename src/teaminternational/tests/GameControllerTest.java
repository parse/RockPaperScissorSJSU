package teaminternational.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import teaminternational.GameController;
import teaminternational.Paper;
import teaminternational.Rock;
import teaminternational.Throw;

public class GameControllerTest {
	@Test public void player1Winner() {
		Throw t1 = new Paper();
		Throw t2 = new Rock();
		
		GameController game = new GameController();
		assertEquals(game.getWinner(t1, t2), 2); 
	}
	
	@Test public void player2Winner() {
		Throw t1 = new Rock();
		Throw t2 = new Paper();
		
		GameController game = new GameController();
		assertEquals(game.getWinner(t1, t2), 1); 
	}
}
