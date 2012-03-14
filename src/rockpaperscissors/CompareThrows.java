
package rockpaperscissors;

/**
 *
 * @author Andreas Autzen
 */
public class CompareThrows 
{
    
    public String findResult (Throw humanThrow,Throw computerThrow)
    {
        String result = "";
        if (humanThrow.toString().equalsIgnoreCase(computerThrow.toString()))
        {
            result = "It was a draw";
        }
        else if(humanThrow instanceof Rock && computerThrow instanceof Paper)
	{
            result = "You have lost";
	}
        else if(humanThrow instanceof Rock && computerThrow instanceof Scissors)
	{
            result = "You have won";
	}
        else if(humanThrow instanceof Paper && computerThrow instanceof Scissors)
	{
            result = "You have lost";
	}
        else if(humanThrow instanceof Paper && computerThrow instanceof Rock)
	{
            result = "You have won";
	}
        else if(humanThrow instanceof Scissors && computerThrow instanceof Paper)
	{
            result = "You have won";
	}
        else if(humanThrow instanceof Scissors && computerThrow instanceof Rock)
	{
            result = "You have lost";
	}

        return result;
    }
}
