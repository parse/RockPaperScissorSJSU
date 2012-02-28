package teaminternational;

public class Game {
	
	final static int BEFORE = -1;
    final static int EQUAL = 0;
    final static int AFTER = 1;
    
    public static void main(String [ ] args) {
		Rock t1 = new Rock();
		Paper t2 = new Paper();
		Scissor t3 = new Scissor();
		
		if (t3.compareTo(t2) == BEFORE) {
			System.out.println("Scissor lost");
		} else if (t3.compareTo(t2) == AFTER) {
			System.out.println("Scissor won!");
		} else {
			System.out.println("Shouldnt happen in this case.");
		}
    }
}
