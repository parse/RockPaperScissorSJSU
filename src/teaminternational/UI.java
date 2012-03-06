package teaminternational;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
    // Main UI loop
	public static void main(String [] args) {
		// Create main controller
		GameController game = new GameController();
		
		// Create players
		Human human = new Human();
		AI computer = new AI();
		
		// Create UI
		UI ui = new UI();
		
		// Dummy-set throws
		Throw t1 = null;
		Throw t2 = null;
		
		Integer mainMenuChoice = ui.getMainMenu();
		
		if (mainMenuChoice == 1) {
			// Select number of rounds and then prompt for choice
			Integer nrRounds = ui.getRoundsInput();
			
			// Start game, attach number of rounds
			game.newGame(nrRounds);
			
			for (int i = 1; i <= nrRounds; i++) {				
				// Get human throw choice, 1=rock, 2=paper, 3=scissor
				Integer playerChoice = ui.getPlayerChoice();
				
				// Create throws
				t1 = game.generateThrowFromInput(playerChoice);
				t2 = computer.getThrow();
				
				// Get winner, 1=player 1, 2=player 2, 3=draw
				int status = game.getWinner(t1, t2);
				
				// Update stats
				game.setWinner(status);
				
				if (status == 1) {
					System.out.println(human.toString() + " won with " + t1.toString() + " against " + t2.toString());
				} else if (status == 2) {
					System.out.println(computer.toString() + " won with " + t2.toString() + " against " + t1.toString());
				} else if (status == 3) {
					System.out.println("Equals with " + t1.toString() );
				}
			}
			
			game.endGame();
			System.out.println(game.getStats());
			
			// @TODO: Show scores and prompt for what we want to do.
			//Integer endGameMenu = ui.getGameoverInput();
		} else if (mainMenuChoice == 2) {
			// Show score
		} else if (mainMenuChoice == 3) {
			// Show Help
		} else {
			// Fallback.
		}
	}
	
	public Integer getMainMenu() {
		System.out.println("Enter your choice, 1 for Start game, 2 for Show score, 3 for Help");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		
		try {
			s = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return Integer.parseInt( s );
	}
	
	public Integer getPlayerChoice() {
		System.out.println("Enter your choice, 1 for Rock, 2 for Paper, 3 for Scissor");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		
		try {
			s = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return Integer.parseInt( s );	
	}
	
	public Integer getRoundsInput() {
		System.out.println("Enter number of rounds");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		
		try {
			s = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return Integer.parseInt( s );
	}
	
}