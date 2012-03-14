package rockpaperscissors;

public class Throw 
{

    public Throw getThrow(String getThrow)
    {
        if(getThrow.equalsIgnoreCase("Rock"))
       {
           return new Rock();
       }
       else if(getThrow.equalsIgnoreCase("Scissors"))
       {
           return new Scissors();
       }
       else if(getThrow.equalsIgnoreCase("Paper"))
       {
           return new Paper();
       }
       else
       {
            return null;
       }
    }
}
