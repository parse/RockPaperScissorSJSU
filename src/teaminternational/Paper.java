package teaminternational;

public class Paper extends Throw {
	
	public int compareTo (Throw t) {	    
	    if (t instanceof Paper) {
	    	return EQUAL;
	    } else if (t instanceof Scissor) {
	    	return BEFORE;
	    } else if (t instanceof Rock) {
	    	return AFTER;
	    } else {
	    	return EQUAL;
	    }
	}
	
	public String toString() {
		return "Paper";
	}
}
