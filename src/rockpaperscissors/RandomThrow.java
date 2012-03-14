
package rockpaperscissors;

import java.util.Random;

/**
 *
 * @author Andreas Autzen
 */
public class RandomThrow extends CalculateThrow 
{
    @Override
    public Throw calculateThrow()
    {
        
        Random random = new Random();
        Throw randomThrow = new Throw();
        
		int pick = random.nextInt(3);
		String calculateThrow = "";
		if (pick == 0) {
			calculateThrow = "Rock";
		} else if (pick == 1) {
			calculateThrow = "Paper";
		} else if (pick == 2) {
			calculateThrow = "Scissors";
		}
                return randomThrow.getThrow(calculateThrow);
                
    }
}
