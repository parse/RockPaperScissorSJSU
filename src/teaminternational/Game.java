package teaminternational;

public class Game {
	
	final static int BEFORE = -1;
	final static int EQUAL 	= 0;
	final static int AFTER 	= 1;
    
	public static void main(String [] args) {
		// Create players
		Human human 	= new Human();
		AI computer 	= new AI();
		
		// Create throws
		Throw t1 	= null;
		Throw t2 	= computer.getThrow();
		
		// Create UI
		UI ui = new UI();
		
		Integer mainMenuChoice = ui.getMainMenu();
		
		if (mainMenuChoice == 1) {
			// Start game
			// Select number of rounds and then prompt for choice
			Integer nrRounds = ui.getRoundsInput();
			
			for (int i = 1; i <= nrRounds; i++) {
				
				// Get human throw choice
				Integer playerChoice = ui.getPlayerChoice();
				
				if (playerChoice == 1) {
					t1 	= new Rock();
				} else if (playerChoice == 2) {
					t1 	= new Paper();
				} else if (playerChoice == 3) {
					t1 	= new Scissor();
				} else {
					t1 	= new Scissor();
				}
				
				// Compare and calculate winner
				if (t1.compareTo(t2) == BEFORE) {
					System.out.println(human.toString() + " won with " + t1.toString() + " against " + t2.toString());
				} else if (t1.compareTo(t2) == AFTER) {
					System.out.println(computer.toString() + " won with " + t2.toString() + " against " + t1.toString());
				} else {
					System.out.println("Equals with " + t1.toString() );
				}
				
				// @TODO: Save statistic for later
			}
			
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
}
