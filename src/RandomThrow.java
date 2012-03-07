
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
		int pick = random.nextInt(3);
		
		if (pick == 0) {
			return new Rock();
		} else if (pick == 1) {
			return new Paper();
		} else if (pick == 2) {
			return new Scissors();
		} else {
			return null; // To get rid of warning
		}
    }
}
