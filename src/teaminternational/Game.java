package teaminternational;

public class Game {
	
	final static int BEFORE = -1;
	final static int EQUAL 	= 0;
	final static int AFTER 	= 1;
    
	public static void main(String [] args) {
		// Create players
		Human human 	= new Human();
		AI computer 	= new AI();
		
		// Create throws
		Throw t1 	= human.getThrow();
		Throw t2 	= computer.getThrow();
		
		// Compare
		if (t1.compareTo(t2) == BEFORE) {
			System.out.println(human.toString() + " won with " + t1.toString() + " against " + t2.toString());
		} else if (t1.compareTo(t2) == AFTER) {
			System.out.println(computer.toString() + " won with " + t2.toString() + " against " + t1.toString());
		} else {
			System.out.println("Equals with " + t1.toString() );
		}
	}
}
