package teaminternational;

public class Scissor extends Throw {
	
	public int compareTo (Throw t) {	    
	    if (t instanceof Paper) {
	    	return BEFORE;
	    } else if (t instanceof Scissor) {
	    	return EQUAL;
	    } else if (t instanceof Rock) {
	    	return AFTER;
	    } else {
	    	return EQUAL;
	    }
	}
	
	public String toString() {
		return "Scissor";
	}
}
