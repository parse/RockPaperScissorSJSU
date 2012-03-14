
package rockpaperscissors;

/**
 *
 * @author Andreas Autzen
 */
public abstract class CalculateThrow 
{
    
    public static CalculateThrow makeCalculator(String type)
    {
        CalculateThrow computerThrow = null;
        if(type.equalsIgnoreCase("RandomThrow"))
        {
            computerThrow = new RandomThrow();
        }
        return computerThrow;
    }
    
    public Throw calculateThrow(){return null;}
}
