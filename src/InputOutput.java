
package rockpaperscissors;

/**
 *
 * @author Andreas Autzen
 */
public abstract class InputOutput
{
    
    public static InputOutput makeInputOutput(String type)
    {
        InputOutput humanInput = null;
        if(type.equalsIgnoreCase("CmdInputOutput"))
        {
            humanInput = new CmdInputOutput();
        }
        return humanInput;
    }
   
   public int getNumberOfGames(){return 0;}

   public String getUserInput(){return null;}
   
   public void printHelp(){   }
   
   public void printScore(int humanScore, int computerScore){}
   
   public void printResult(Throw humanThrow, Throw computerThrow, String result) {}
}
