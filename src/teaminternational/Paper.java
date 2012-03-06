package teaminternational;

public class Paper extends Throw {
	
	public int compareTo (Throw t) {	    
	    if (t instanceof Paper) {
	    	return EQUAL;
	    } else if (t instanceof Scissor) {
	    	return AFTER;
	    } else if (t instanceof Rock) {
	    	return BEFORE;
	    } else {
	    	return EQUAL;
	    }
	}
	
	public String toString() {
		return "Paper";
	}
}
