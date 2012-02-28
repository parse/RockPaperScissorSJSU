package teaminternational;

public class Game {
	
	final static int BEFORE = -1;
    final static int EQUAL 	= 0;
    final static int AFTER 	= 1;
    
    public static void main(String [] args) {
    	Human p1 	= new Human();
    	AI p2 		= new AI();
		
		Throw t1 	= p1.getThrow();
		Throw t2 	= p2.getThrow();
		
		if (t1.compareTo(t2) == BEFORE) {
			System.out.println("Player 1 won with " + t1.toString());
		} else if (t1.compareTo(t2) == AFTER) {
			System.out.println("Player 2 won with " + t2.toString());
		} else {
			System.out.println("Equals with " + t1.toString() );
		}
    }
}
