
package rockpaperscissors;

/**
 *
 * @author Andreas Autzen
 */
public class HumanPlayer
{
   private Throw humanThrow;
   private InputOutput inputOutput;
   private int humanScore;
   
   
   public HumanPlayer()
   {
       humanThrow = null;
       inputOutput = InputOutput.makeInputOutput("CmdInputOutput");
       humanScore = 0;
   }

    public int getHumanScore() {
        return humanScore;
    }

    public void setHumanScore(int humanScore) {
        this.humanScore = humanScore;
    }
   
   
   public void setHumanThrow(String humanThrow)
   {
       if(humanThrow.equalsIgnoreCase("Rock"))
       {
           this.humanThrow = new Rock();
       }
       else if(humanThrow.equalsIgnoreCase("Scissors"))
       {
           this.humanThrow = new Scissors();
       }
       else if(humanThrow.equalsIgnoreCase("Paper"))
       {
           this.humanThrow = new Paper();
       }
   }
   
   public Throw getHumanThrow()
   {
       return this.humanThrow;
   }
   
   public InputOutput getInputOutput()
   {
       return inputOutput;
   }
   
   public int getNumberOfGames(){return inputOutput.getNumberOfGames();}
   
   public String getUserInput(){return inputOutput.getUserInput();}
    
}
