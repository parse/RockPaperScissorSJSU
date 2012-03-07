package rockpaperscissors;
/**
 *
 * @author Andreas Autzen
 */

public class ComputerPlayer
{
    
        private Throw computerThrow;
        private CalculateThrow calculateThrow;
        private int ComputerScore;

 
        
        public ComputerPlayer()
        {
            computerThrow = null;
            calculateThrow = CalculateThrow.makeCalculator("RandomThrow");
            ComputerScore = 0;
        }
	
        public int getComputerScore() {
            return ComputerScore;
        }

        public void setComputerScore(int ComputerScore) {
            this.ComputerScore = ComputerScore;
        }
        
        public void setComputerThrow()
        {
            this.computerThrow = calculateThrow.calculateThrow();
        }
        
        public Throw getComputerThrow()
        {
            return computerThrow;
        }
        
        
        @Override
	public String toString() {
		return "Computer";
	}
}
