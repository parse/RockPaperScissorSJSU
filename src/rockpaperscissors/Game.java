
package rockpaperscissors;


/**
 *
 * @author Andreas Autzen
 */
public class Game 
{
    private static Game game;
    private ComputerPlayer computerPlayer;
    private HumanPlayer humanPlayer;
    private CompareThrows compareThrows;
    
    
    private Game()
    {
        computerPlayer = new ComputerPlayer();
        humanPlayer = new HumanPlayer();
        compareThrows = new CompareThrows();
    }
    
    
    public static Game getSingleton() 
    {
		if (game == null) {
			game = new Game();
		}
		return game;
    }
    
    public String findResult()
    {
        return compareThrows.findResult(humanPlayer.getHumanThrow(), computerPlayer.getComputerThrow());
    }
    
    public void Play()
    {
        
         int numberOfGames = humanPlayer.getInputOutput().getNumberOfGames();
         int humanScore = 0;
         int computerScore = 0;
         String humanThrow;
         
         for(int i = 1; i <= numberOfGames; i++)
         {
             humanThrow = humanPlayer.getInputOutput().getUserInput();
            if(humanThrow.equalsIgnoreCase("help"))
            {
                humanPlayer.getInputOutput().printHelp();
                i--;
            }
            else if(humanThrow.equalsIgnoreCase("score"))
            {
                humanPlayer.getInputOutput().printScore(humanPlayer.getHumanScore(), computerPlayer.getComputerScore());
                i--;
            }
            else
            {
            humanPlayer.setHumanThrow(humanThrow);
            computerPlayer.setComputerThrow();
            String result = findResult();
            humanPlayer.getInputOutput().printResult(humanPlayer.getHumanThrow(), computerPlayer.getComputerThrow(), result);
            if(result.equalsIgnoreCase("you have won"))
            {
                humanScore++;
                humanPlayer.setHumanScore(humanScore);
            }
            else if(result.equalsIgnoreCase("you have lost"))
            {
                computerScore++;
                computerPlayer.setComputerScore(computerScore);
            }
            humanPlayer.getInputOutput().printScore(humanScore, computerScore);
            }
         }
    }
    
    
}
