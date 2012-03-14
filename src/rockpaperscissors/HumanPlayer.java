
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
       humanThrow = new Throw();
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
       this.humanThrow = this.humanThrow.getThrow(humanThrow);

   }
   
   public Throw getHumanThrow()
   {
       return this.humanThrow;
   }
   
   public InputOutput getInputOutput()
   {
       return inputOutput;
   }
   

    
}
