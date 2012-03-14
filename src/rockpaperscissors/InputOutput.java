
package rockpaperscissors;

/**
 *
 * @author Andreas Autzen
 */
public abstract class InputOutput
{
    
    public static InputOutput makeInputOutput(String type)
    {
        InputOutput inputOutput = null;
        if(type.equalsIgnoreCase("CmdInputOutput"))
        {
            inputOutput = new CmdInputOutput();
        }
        return inputOutput;
    }
   
   public void setNumberOfGames(int numberOfGames){} 
    
   public int getNumberOfGames(){return 0;}

   public String getUserInput(){return null;}
   
   public void printHelp(){   }
   
   public void printScore(int humanScore, int computerScore){}
   
   public void printResult(Throw humanThrow, Throw computerThrow, String result) {}
}
