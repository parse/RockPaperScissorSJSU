
package rockpaperscissors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andreas Autzen
 */
public class CmdInputOutput extends InputOutput
{
   private BufferedReader stdin;
   
   public CmdInputOutput()
   {
       stdin = new BufferedReader
           (new InputStreamReader(System.in));
   }
   
   @Override
   public int getNumberOfGames()
   {
        int numberOfGames = 0;
        
           
         System.out.println("Enter number of games:");
        try {
            numberOfGames = Integer.parseInt(stdin.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numberOfGames;
   }
   
   @Override
   public String getUserInput()
   {
        String humanThrow = "";
        
        do
        {
        System.out.println("\nEnter your throw: Rock/Paper/Scissors | Type help for help or score for score:");
        try {
            humanThrow = stdin.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        while(!humanThrow.equalsIgnoreCase("rock") && !humanThrow.equalsIgnoreCase("paper")
                && !humanThrow.equalsIgnoreCase("scissors") && !humanThrow.equalsIgnoreCase("help") && !humanThrow.equalsIgnoreCase("score"));
        
        return humanThrow;
   }
    
   @Override
   public void printHelp()
   {
       System.out.println("\nHelp:\nRock beats scissors.\nScissors beats paper.\nPaper beats rock.\n"
               + "Enter one of the valid throws, namely rock, paper or scissors.\n"
               + "Enter score for seeing the score at any time\n");
   }
   @Override
   public void printScore(int humanScore, int computerScore)
   {
       System.out.println("Score:\nYour score: " + humanScore + "\nComputer score: " + computerScore + "\n");
   }
   @Override
   public void printResult(Throw humanThrow, Throw computerThrow, String result) 
   {
       System.out.println("\nYour throw: " + humanThrow + "\nComputer's throw: " + computerThrow
                + "\nResult: " + result + "\n");
   }

}
